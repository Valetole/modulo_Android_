package cl.valentina.miapp.room.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import cl.valentina.miapp.R
import cl.valentina.miapp.room.StockProductosEntity
import cl.valentina.miapp.view.activity.PantallaMiPedido
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerViewAdapter(private val activity: Activity) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    private var listData: List<StockProductosEntity>? = null
    fun setListData(listData: List<StockProductosEntity>?) {
        this.listData = listData
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler,parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(listData?.get(position)!!)
        holder.boton.setOnClickListener {
            val siguiente = Intent(activity, PantallaMiPedido::class.java)
            activity.startActivity(siguiente)
        }
        /*holder.botonCarrito.setOnClickListener{
            val intent = Intent(activity, PantallaMiPedido::class.java)
            activity.startActivity(intent)
        }*/

    }

    override fun getItemCount(): Int {
        if(listData == null ) return 0
        return listData?.size!!
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imagen = view.imageViewProducto
    val idProducto = view.textViewID
    val nombreProducto= view.tvNombreProducto
    val descripcion = view.tvDescripcion
    val precio = view.tvPrecio
    val cantidadProducto = view.tvCantidadStock
        val boton = view.button_añadir
        //val botonCarrito = view.botonCarrito

        fun bind(data:StockProductosEntity) {
            nombreProducto.text = data.nombre
            descripcion.text = data.descripcion
            precio.text = data.precio
            idProducto.text = data.id.toString()
            cantidadProducto.text = data.cantidad.toString()

            Glide.with(imagen)
                .load(data.url)
                .into(imagen)

        }

    }
}
