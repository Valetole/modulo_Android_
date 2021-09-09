package cl.valentina.miapp.api

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import cl.valentina.miapp.R
import cl.valentina.miapp.databinding.RecyclerviewStockProductosBinding


class StockProductosAdapter( //List<StockProductos>
        private val stocks: List<StockProductos>,
        private val listener: RecyclerViewClickListener
    ) : RecyclerView.Adapter<StockProductosAdapter.StockProductosViewHolder>() {

    override fun getItemCount() = stocks.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        StockProductosViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_stock_productos,
                parent,
                false
            )

        )

    override fun onBindViewHolder(holder: StockProductosViewHolder, position: Int) {
        holder.recyclerviewStockProductosBinding.stock = stocks[position]
        holder.recyclerviewStockProductosBinding.buttonBook.setOnClickListener {
            listener.onRecyclerItemClick(holder.recyclerviewStockProductosBinding.buttonBook, stocks[position])
        }
    }

    inner class StockProductosViewHolder(
       val recyclerviewStockProductosBinding: RecyclerviewStockProductosBinding
    ) : RecyclerView.ViewHolder(recyclerviewStockProductosBinding.root)
}