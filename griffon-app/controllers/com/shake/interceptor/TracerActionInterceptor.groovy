package com.shake.interceptor

import griffon.core.artifact.GriffonController
import griffon.core.controller.ActionExecutionStatus

import javax.inject.Named

import org.codehaus.griffon.runtime.core.controller.AbstractActionInterceptor

@Named('tracer')
class TracerActionInterceptor extends AbstractActionInterceptor{
	private final Map<String, Long> TIMES = [:]

	Object[] before(GriffonController controller, String actionName, Object[] args) {
		TIMES[qualifyActionName(controller, actionName)] = System.currentTimeMillis()
		return super.before(controller, actionName, args)
	}

	void after(ActionExecutionStatus status, GriffonController controller, String actionName, Object[] args) {
		String qualifiedActionName = qualifyActionName(controller, actionName)
		long time = System.currentTimeMillis() - TIMES[qualifiedActionName]
		println("Action ${qualifiedActionName} took ${time} ms [${status}]")
	}
}