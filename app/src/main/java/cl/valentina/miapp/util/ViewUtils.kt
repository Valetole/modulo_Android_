package cl.valentina.miapp.util

import android.content.Context
import android.widget.Toast

fun Context.toast(mensaje:String) {
    Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

}
//R.id.nav_item_tres -> {
//  startActivity(Intent(this, MainActivityRecycler::class.java))
// }

//R.id.nav_item_tres -> fun verStock(item: MenuItem) {
//                val intent=Intent(this,)
//
//            }
//R.id.nav_item_tres -> val intent: Intent = Intent(this, MainActivityRecycler::class.java)
//startActivity(intent)


//override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.nav_item_tres -> {
//              startActivity(Intent (this, MainActivityRecycler::class.java))
//              true
//        }
//        else -> super.onOptionsItemSelected(item)
//    }
// }

//Código RecyclerViewAdapter Java

//package cl.valentina.miapp.adapter;
//
//import android.app.Activity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//import cl.valentina.miapp.R;
//import cl.valentina.miapp.model.StockProductosModel;
//
//public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    Activity context;
//    ArrayList<StockProductosModel> stockProductosModelArrayList;
//
//    public RecyclerViewAdapter(Activity context, ArrayList<StockProductosModel>stockProductosModelArrayList) {
//        this.context = context;
//        this.stockProductosModelArrayList = stockProductosModelArrayList;
//    }
//
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View rootView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
//        return new RecyclerViewViewHolder(rootView);
//
//    }
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        StockProductosModel stockProductosModel = stockProductosModelArrayList.get(position);
//        RecyclerViewViewHolder viewHolder = (RecyclerViewViewHolder) holder;
//
//        viewHolder.imagen_producto.setImageResource(stockProductosModel.getImagen());
//        viewHolder.tv_nombreProducto.setText(stockProductosModel.getNombre());
//        viewHolder.tv_precioProducto.setText(stockProductosModel.getPrecio());
//        viewHolder.tv_stockProducto.setText(stockProductosModel.getStock());
//    }
//
//    @Override
//    public int getItemCount() {
//        return stockProductosModelArrayList.size();
//    }
//
//    class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
//        ImageView imagen_producto;
//        TextView tv_nombreProducto;
//        TextView tv_precioProducto;
//        TextView tv_stockProducto;
//
//        public RecyclerViewViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imagen_producto = itemView.findViewById(R.id.imagen_Producto);
//            tv_nombreProducto = itemView.findViewById(R.id.tv_nombreProducto);
//            tv_precioProducto = itemView.findViewById(R.id.tv_precioProducto);
//            tv_stockProducto = itemView.findViewById(R.id.tv_stockProducto);
//        }
//   }
//}

// Código MainViewModelStockproductos
//package cl.valentina.miapp.viewModel;
//
//
//import static cl.valentina.miapp.R.drawable.amasado;
//
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//
//import java.util.ArrayList;
//
//import cl.valentina.miapp.R;
//import cl.valentina.miapp.model.StockProductosModel;
//
//public class MainViewModelStockProductos extends ViewModel {
//
//    MutableLiveData<ArrayList<StockProductosModel>> stockProductosModelLiveData;
//    ArrayList<StockProductosModel> stockProductosModelArrayList;
//
//    public MainViewModelStockProductos() {
//        stockProductosModelLiveData = new MutableLiveData<>();
//
//        // Acá se llama a la Api Rest
//        init();
//    }
//
//    public MutableLiveData<ArrayList<StockProductosModel>> getStockProductosMutableLiveData() {
//        return stockProductosModelLiveData;
//    }
//
//    private void init() {
//        populateList();
//        stockProductosModelLiveData.setValue(stockProductosModelArrayList);
//    }
//
//    public void populateList() {
//
//        StockProductosModel stockProductosModel = new StockProductosModel();
//
//
//
//        //stockProductosModel.setImagen(R.drawable.frutas);
//        //stockProductosModel.setNombre("Pan Amasado");
//        //stockProductosModel.setPrecio("$ 200 c/u");
//        //stockProductosModel.setStock("65 unidades");
//
//        stockProductosModelArrayList = new ArrayList<>();
//
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.baseline_lunch_dining_black_24dp,"Hamburguesa Doblw","$3.500","5"));
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
//        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
//        //stockProductosModelArrayList.add(stockProductosModel);
//        //stockProductosModelArrayList.add(stockProductosModel);
//        //stockProductosModelArrayList.add(stockProductosModel);
//
//
//    }
//}

//Código MainActivityStockProductos

//package cl.valentina.miapp.ui;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.lifecycle.LifecycleOwner;
//import androidx.lifecycle.Observer;
//import androidx.lifecycle.ViewModelProviders;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import android.os.Bundle;
//
//import java.util.ArrayList;
//
//import cl.valentina.miapp.R;
//import cl.valentina.miapp.adapter.RecyclerViewAdapter;
//import cl.valentina.miapp.model.StockProductosModel;
//import cl.valentina.miapp.viewModel.MainViewModelStockProductos;
//
//public class MainActivityStockProductos extends AppCompatActivity implements LifecycleOwner {
//
//    MainActivityStockProductos context;
//    MainViewModelStockProductos viewModelStockProductos;
//    RecyclerView recyclerView;
//    RecyclerViewAdapter recyclerViewAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_stock_productos);
//        context = this;
//        recyclerView = findViewById(R.id.rv_main);
//        viewModelStockProductos = ViewModelProviders.of(context).get(MainViewModelStockProductos.class);
//        viewModelStockProductos.getStockProductosMutableLiveData().observe(context, stockProductosListUpdateObserver);
//
//    }
//
//    Observer<ArrayList<StockProductosModel>> stockProductosListUpdateObserver = new Observer<ArrayList<StockProductosModel>>() {
//        @Override
//        public void onChanged(ArrayList<StockProductosModel> stockProductosModelArrayList) {
//            recyclerViewAdapter = new RecyclerViewAdapter(context, stockProductosModelArrayList);
//            recyclerView.setLayoutManager(new LinearLayoutManager(context));
//            recyclerView.setAdapter(recyclerViewAdapter);
//        }
//    };
//}



