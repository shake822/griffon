package com.shake

class GroovyShellEvaluator implements Evaluator {
	private GroovyShell shell = new GroovyShell()
	@Override
	public Object evaluate(String input) {
		shell.evaluate(input)
	}
}
