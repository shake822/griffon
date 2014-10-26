package com.shake

import griffon.core.artifact.GriffonView
import griffon.core.env.Environment
import griffon.core.env.Metadata
import griffon.metadata.ArtifactProviderFor
import static griffon.core.env.GriffonEnvironment.*

@ArtifactProviderFor(GriffonView)
class SampleView {
	FactoryBuilderSupport builder

	void initUI(){
		Metadata meta = Metadata.current
		builder.with {
			application(pack: true,
			title: application.configuration['application.title']) {
				gridLayout cols: 1, rows: 6
				label "Hello, I'm ${meta['application.name']}-${meta['application.version']}"
				label "Current environment is ${Environment.current}"
				label "Griffon version is ${getGriffonVersion()}"
				label "Build date/time is ${getBuildDateTime()}"
				label "JVM version is ${getJvmVersion()}"
				label "OS version is ${getOsVersion()}"
			}
		}
	}
}
