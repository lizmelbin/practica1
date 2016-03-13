/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica1;

/**
 *
 * @author user
 */
public class Edificio {
    
    private int pisos;
    private int  puertas;
    private String nombre;

    public Edificio(int pisos, int puertas, String nombre) {
        this.pisos = pisos;
        this.puertas = puertas;
        this.nombre = nombre;
    }

    /**
     * @return the pisos
     */
    public int getPisos() {
        return pisos;
    }

    /**
     * @param pisos the pisos to set
     */
    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
            
            
    
}
