package cl.valentina.miapp.api

import android.view.View

interface RecyclerViewClickListener {
    fun onRecyclerItemClick (view: View, stockProductos: StockProductos)
}