package cl.valentina.miapp.room.network


import android.util.Log
import androidx.lifecycle.LiveData
import cl.valentina.miapp.room.StockProductosDAO
import cl.valentina.miapp.room.StockProductosEntity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RetroRepository @Inject constructor(
    private val retroServiceInterface: RetroServiceInterface,
    private val stockProductosDAO: StockProductosDAO
) {
    fun getStock(): LiveData<List<StockProductosEntity>> {
        return stockProductosDAO.getStockProductos()
        //obtiene todos los registros de la base de datos
    }

    fun insertStock(stockProductosEntity: StockProductosEntity) {
        stockProductosDAO.insertStockProductos(stockProductosEntity)
        //registra estos datos y los pasa a la entity
    }
    fun callApi() { //Solicitud asincrónica
        val call: Call<List<StockProductosEntity>> = retroServiceInterface.getDataFromApi()
        call?.enqueue(object: Callback<List<StockProductosEntity>> {
            override fun onResponse(
                call: Call<List<StockProductosEntity>>,
                response: Response<List<StockProductosEntity>>
            ) {
                if (response.isSuccessful) {
                    stockProductosDAO.deleteStockProductos()
                    response.body()?.forEach {
                        insertStock(it)
                    }
                }
            }

            override fun onFailure(call: Call<List<StockProductosEntity>>, t: Throwable) {

            }
        })

    }
}
//