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
public class ClsPisos extends ClsInmuebles{
    int numPiso;

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public ClsPisos(int numPiso, String direccion, int numMts, boolean condicion) {
        super(direccion, numMts, condicion);
        this.numPiso = numPiso;
    }
}
