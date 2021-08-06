package cl.valentina.miapp.model;

import android.graphics.drawable.Drawable;

public class StockProductosModel {
    private int imagen;
    private String nombre;
    private String precio;
    private String stock;

    public StockProductosModel() {
    }

    public StockProductosModel(int imagen, String nombre, String precio, String stock) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
