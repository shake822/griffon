package com.shake

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

import javax.inject.Inject

@ArtifactProviderFor(GriffonController)
class ConsoleController {
    ConsoleModel model
	
	void mvcGroupInit(Map<String, Object> args) {
		println args.configuration.config.key
	}
	
	@Inject
	Evaluator evaluator
	
	
	void executeScript() {
		model.enabled = false
		def result
		try {
			result = evaluator.evaluate(model.scriptSource)
		} finally {
			model.enabled = true
			model.scriptResult = result
		}
	}
    void click() {
        model.clickCount++
    }
}