package cl.valentina.miapp.modelAjenoAlproyectoPracticas;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String rut;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoelectronico;
    private String contraseña;
    private Date fechaRegistro;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Cliente(int idCliente, String rut, String nombre, String apellido, String telefono, String correoelectronico, String contraseña, Date fechaRegistro) {
        this.idCliente = idCliente;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }

    public Cliente() {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoelectronico='" + correoelectronico + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}

	