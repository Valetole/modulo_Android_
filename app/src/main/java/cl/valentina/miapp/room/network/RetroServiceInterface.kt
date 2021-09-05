package cl.valentina.miapp.room.network

import cl.valentina.miapp.room.StockProductosEntity
import retrofit2.Call
import retrofit2.http.GET

interface RetroServiceInterface {

    @GET ("Valetole.json")
   fun getDataFromApi(): Call<List<StockProductosEntity>>
}
