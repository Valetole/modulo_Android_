package cl.valentina.miapp

interface UsuarioObserver {
    fun inicio()
    fun inicioExitoso()
    fun inicioFatal(mensaje:String)
}