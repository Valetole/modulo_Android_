package cl.valentina.miapp.api

//En la clase de repositorio, pasamos la instancia del servicio de actualización para realizar la llamada de red.

class StockProductosRepository (
    private val api: StockProductosAPI
        ): SafeApiRequest() {

            suspend fun getStockProductos() = apiRequest {api.getStockProductos()}

}