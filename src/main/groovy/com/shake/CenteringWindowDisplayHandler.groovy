package com.shake

import java.awt.Window

import javax.annotation.Nonnull

import org.codehaus.griffon.runtime.swing.DefaultSwingWindowDisplayHandler

class CenteringWindowDisplayHandler extends DefaultSwingWindowDisplayHandler {
	@Override
	void show(@Nonnull String name, @Nonnull Window window) {
		println "CenteringWindowDisplayHandler show $name "
		centerOnScreen(window)
		super.show(name, window)
	}

	void centerOnScreen(Window window){
	}
}