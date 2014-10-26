package com.shake

import griffon.core.GriffonApplication
import griffon.core.event.EventHandler

class ApplicationEventHandler implements EventHandler {
	void onBootstrapStart(GriffonApplication application) {
		println "ApplicationEventHandler.onBootstrapStart"
	}
}