package com.skynoff.udo.lennkenshop;

/**
 * Created by Skynoff on 16/10/2016.
 */

public class producto {
    int imagen;
    String nombre;
    double precio;

    public producto(int imagen, String nombre, double precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
