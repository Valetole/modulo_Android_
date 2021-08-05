package cl.valentina.miapp.viewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import cl.valentina.miapp.R

//ViewHolder inicializa las vistas del item
//Adapter rellena el recyclerView
class MainAdapter: RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    val productos = arrayOf(
            "BROWNIE",
            "MIX FRUTAS",
            "LASAGNA",
            "PAN AMASADO"
    )
    val precios = arrayOf(
            "$6.000",
            "$5.000 a $20.000",
            "$4.000",
            "$200 c/u"
    )
    val imagenes = arrayOf(
            R.drawable.brownie,
            R.drawable.frutas,
            R.drawable.ic_baseline_person_24,
            R.drawable.amasado
    )
    val cantidad = arrayOf(
            0,
            15,
            7,
            5
    )


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
       viewHolder.itemTitle.text=productos[i]
        viewHolder.itemDetail.text=precios[i]
        viewHolder.itemStock.text=cantidad[i].toString()
        viewHolder.itemImage.setImageResource(imagenes[i])

    }

    override fun getItemCount(): Int {
        return productos.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemStock: TextView

        init {
            itemImage= itemView.findViewById(R.id.imagenProducto)
            itemTitle= itemView.findViewById(R.id.nombreProducto)
            itemDetail=itemView.findViewById(R.id.precioProducto)
            itemStock=itemView.findViewById(R.id.cantidadProducto)
        }
    }
}

