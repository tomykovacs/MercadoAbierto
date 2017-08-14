package com.example.dh1.mercadoabierto.Model.POJO;

/**
 * Created by dh1 on 03/05/17.
 */

public class Articulo {
    private String nombre;
    private String precio;
    private String descripcion;
    private Integer fotoResource = 0;

    public Articulo(String nombre, String precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Articulo(String nombre, String precio, String descripcion, Integer fotoResource) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fotoResource = fotoResource;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getFotoResource() {
        return fotoResource;
    }
}
