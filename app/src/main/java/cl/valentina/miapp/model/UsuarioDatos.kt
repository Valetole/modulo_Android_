package cl.valentina.miapp.model

class UsuarioDatos {
    companion object {

        fun inicioSesion(): UsuarioModel {

            val u=usuarios[1]
            return u

        }

        private val usuarios = listOf<UsuarioModel>(
                UsuarioModel(
                        correoelectronico = "vale@gmail.com",
                        clave = "0000"
                ),
                UsuarioModel(
                        correoelectronico = "rodo@gmail.com",
                        clave = "0000"
                )
        )

    }

}