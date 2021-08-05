package cl.valentina.miapp.viewModel

interface UsuarioObserver {
    fun inicio()
    fun inicioExitoso()
    fun inicioFatal(mensaje:String)
}