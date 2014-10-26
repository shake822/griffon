import com.shake.CenteringWindowDisplayHandler

application {
    title = 'random'
    startupGroups = ['random']
    autoShutdown = true
	griffonVersion=2.0
}
windowManager {
	defaultHandler = new CenteringWindowDisplayHandler()
	//startingWindow = 'primary'
}
mvcGroups {
    // MVC Group for "console"
    'console' {
        model      = 'com.shake.ConsoleModel'
        view       = 'com.shake.SampleView'
        controller = 'com.shake.ConsoleController'
		config {
			key = 'bar'
		}
    }
	'random'{
		model="com.shake.RandomModel"
		view ="com.shake.RandomView"
		controller="com.shake.RandomController"
	}
}