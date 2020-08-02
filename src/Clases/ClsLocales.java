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
public class ClsLocales extends ClsInmuebles{
 int numVentanas;   

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public ClsLocales(int numVentanas, String direccion, int numMts, boolean condicion) {
        super(direccion, numMts, condicion);
        this.numVentanas = numVentanas;
    }
}
