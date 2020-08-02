/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Bryner
 */
public class ClsInmuebles {
    String direccion;
    int numMts;
    boolean condicion;
    double precio;

    public ClsInmuebles(String direccion, int numMts, boolean condicion ) {
        this.direccion = direccion;
        this.numMts = numMts;
        this.condicion = condicion;
       
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumMts() {
        return numMts;
    }

    public void setNumMts(int numMts) {
        this.numMts = numMts;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
