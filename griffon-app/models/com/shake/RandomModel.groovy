package com.shake

import griffon.core.artifact.GriffonModel
import griffon.metadata.ArtifactProviderFor
import griffon.transform.Observable
@ArtifactProviderFor(GriffonModel)
class RandomModel {


	@Observable int number = 1
}
