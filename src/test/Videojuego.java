/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author dmorenoar
 */
public class Videojuego {
    private String titulo = "";
    private double precio = 0.0;
    private String genero = "ARCADE";
    private static int id = 0;
    
    
    public Videojuego(String titulo, double precio, String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
        id++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", precio=" + precio + ", genero=" + genero + '}';
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Videojuego.id = id;
    }
    
    
    
    
    
}
