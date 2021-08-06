package cl.valentina.miapp.viewModel;


import static cl.valentina.miapp.R.drawable.amasado;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import cl.valentina.miapp.R;
import cl.valentina.miapp.model.StockProductosModel;

public class MainViewModelStockProductos extends ViewModel {

    MutableLiveData<ArrayList<StockProductosModel>> stockProductosModelLiveData;
    ArrayList<StockProductosModel> stockProductosModelArrayList;

    public MainViewModelStockProductos() {
        stockProductosModelLiveData = new MutableLiveData<>();

        // Acá se llama a la Api Rest
        init();
    }

    public MutableLiveData<ArrayList<StockProductosModel>> getStockProductosMutableLiveData() {
        return stockProductosModelLiveData;
    }

    private void init() {
        populateList();
        stockProductosModelLiveData.setValue(stockProductosModelArrayList);
    }

    public void populateList() {

        StockProductosModel stockProductosModel = new StockProductosModel();



        //stockProductosModel.setImagen(R.drawable.frutas);
        //stockProductosModel.setNombre("Pan Amasado");
        //stockProductosModel.setPrecio("$ 200 c/u");
        //stockProductosModel.setStock("65 unidades");

        stockProductosModelArrayList = new ArrayList<>();

        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.baseline_lunch_dining_black_24dp,"Hamburguesa Doblw","$3.500","5"));
        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
        stockProductosModelArrayList.add(new StockProductosModel(R.drawable.amasado,"Pan Amasado","$200 c/u","5"));
        //stockProductosModelArrayList.add(stockProductosModel);
        //stockProductosModelArrayList.add(stockProductosModel);
        //stockProductosModelArrayList.add(stockProductosModel);


    }
}


