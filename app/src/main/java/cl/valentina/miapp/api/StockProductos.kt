package cl.valentina.miapp.api

//POJO modelo de datos. no se comunica con la vista, expone los datos al ViewModel

data class StockProductos(
    val cantidad: Int,
    val descripcion: String,
    val id: Int,
    val nombre: String,
    val precio: String,
    val url: String
)