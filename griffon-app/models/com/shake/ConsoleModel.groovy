package com.shake

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonModel)
class ConsoleModel {
    @Observable int clickCount = 0
	String scriptSource
	@Observable Object scriptResult
	@Observable boolean enabled = true
}