package com.shake

import griffon.core.artifact.GriffonView
import griffon.metadata.ArtifactProviderFor
import groovy.swing.SwingBuilder
@ArtifactProviderFor(GriffonView)
class RandomView {
	FactoryBuilderSupport builder
	RandomModel model


	void initUI(){


		builder.with {
			application(pack: true,
			title: application.configuration['application.title']) {
				gridLayout cols: 1, rows: 3
				label (text: bind { model.number })
				button(randomNumberAction)
				button(sendEventAction)
				menuBar{
					menu(text: "File", mnemonic: 'F') {
						menuItem(text: "Exit", mnemonic: 'X', actionPerformed: { dispose() })
					}
				}
			}
		}
	}
}
