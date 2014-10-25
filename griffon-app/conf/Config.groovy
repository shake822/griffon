application {
    title = 'console'
    startupGroups = ['console']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "console"
    'console' {
        model      = 'com.shake.ConsoleModel'
        view       = 'com.shake.ConsoleView'
        controller = 'com.shake.ConsoleController'
    }
}