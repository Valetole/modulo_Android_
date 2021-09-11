package cl.valentina.miapp.modelAjenoAlproyectoPracticas;

public class Producto {

	private String idProducto;
	private String nombre;
	private String tipoProducto;
	private String descripcion;
	private int precio;

	public Producto(String idProducto, String nombre, String tipoProducto, String descripcion, int precio) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Producto() {

	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto{" +
				"idProducto='" + idProducto + '\'' +
				", nombre='" + nombre + '\'' +
				", tipoProducto='" + tipoProducto + '\'' +
				", descripcion='" + descripcion + '\'' +
				", precio=" + precio +
				'}';
	}
}

