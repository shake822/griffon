package com.shake

import griffon.core.CallableWithArgs
import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonController)
class RandomController {

	RandomModel model

	void mvcGroupInit(Map<String, Object> args) {
		application.eventRouter.addEventListener("Random", { println 'got foo!' } as CallableWithArgs)
	}
	void randomNumber(){
		model.number = (int)Math.round(Math.random()*100)
	}
	void sendEvent(){
		application.eventRouter.publishEvent("Random")
	}
}
