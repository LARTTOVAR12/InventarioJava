/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

//se crea las variables 
public class Producto {
 
    private String  nombre;
    private int cantidad;
    private String fechaV;
    private double precio;
    private double total;
// se crea el constructor para las variables
    public Producto(String nombre, int cantidad, String fechaV, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaV = fechaV;
        this.precio = precio;
    }
//se crea los Getter y los Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getFecha(){
        return fechaV;
    }
    
    public void setFecha(String fecha){
        this.fechaV = fechaV;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public Double total(){
        Double total = cantidad*precio;
        return total;
    }

    double gettotal() {
        Double total = cantidad*precio;
        return total;
    }

    
    
}


