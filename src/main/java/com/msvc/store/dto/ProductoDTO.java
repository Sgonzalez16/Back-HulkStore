package com.msvc.store.dto;

public class ProductoDTO {
    private String nombre;
    private  double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public ProductoDTO(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
