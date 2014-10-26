package com.shake
	
import griffon.core.controller.ActionInterceptor
import griffon.core.event.EventHandler
import griffon.core.injection.Module
import griffon.inject.DependsOn
import griffon.swing.SwingWindowDisplayHandler

import org.codehaus.griffon.runtime.core.injection.AbstractModule
import org.kordamp.jipsy.ServiceProviderFor

import com.shake.interceptor.TracerActionInterceptor


@DependsOn('swing')
@ServiceProviderFor(Module)
class ApplicationModule extends AbstractModule {

	@Override
	protected void doConfigure() {
		println "ApplicationModule.doConfigure"
		bind(Evaluator)
				.to(GroovyShellEvaluator)
				.asSingleton()

		bind(SwingWindowDisplayHandler)
				//.withClassifier(named('defaultWindowDisplayHandler'))
				.to(CenteringWindowDisplayHandler)
				.asSingleton()

		bind(EventHandler)
				.to(ApplicationEventHandler)
				.asSingleton()
				
		bind(ActionInterceptor)
			.to(TracerActionInterceptor)
			.asSingleton()
	}
}