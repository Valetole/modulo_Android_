package cl.valentina.miapp.room.network

import cl.valentina.miapp.room.StockProductosEntity
import cl.valentina.miapp.room.model.StockProductosModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET ("Valetole.json")
   fun getDataFromApi(): Call<List<StockProductosEntity>>

   //@GET ("buscarproducto.php?")
   //fun getProducto(@Query ("id") id: Int): Call<List<StockProductosModel>>
}
