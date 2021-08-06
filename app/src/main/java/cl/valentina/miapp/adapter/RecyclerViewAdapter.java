package cl.valentina.miapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cl.valentina.miapp.R;
import cl.valentina.miapp.model.StockProductosModel;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Activity context;
    ArrayList<StockProductosModel> stockProductosModelArrayList;

    public RecyclerViewAdapter(Activity context, ArrayList<StockProductosModel>stockProductosModelArrayList) {
        this.context = context;
        this.stockProductosModelArrayList = stockProductosModelArrayList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new RecyclerViewViewHolder(rootView);

    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StockProductosModel stockProductosModel = stockProductosModelArrayList.get(position);
        RecyclerViewViewHolder viewHolder = (RecyclerViewViewHolder) holder;

        viewHolder.imagen_producto.setImageResource(stockProductosModel.getImagen());
        viewHolder.tv_nombreProducto.setText(stockProductosModel.getNombre());
        viewHolder.tv_precioProducto.setText(stockProductosModel.getPrecio());
        viewHolder.tv_stockProducto.setText(stockProductosModel.getStock());
    }

    @Override
    public int getItemCount() {
        return stockProductosModelArrayList.size();
    }

    class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen_producto;
        TextView tv_nombreProducto;
        TextView tv_precioProducto;
        TextView tv_stockProducto;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen_producto = itemView.findViewById(R.id.imagen_Producto);
            tv_nombreProducto = itemView.findViewById(R.id.tv_nombreProducto);
            tv_precioProducto = itemView.findViewById(R.id.tv_precioProducto);
            tv_stockProducto = itemView.findViewById(R.id.tv_stockProducto);
        }
   }
}
