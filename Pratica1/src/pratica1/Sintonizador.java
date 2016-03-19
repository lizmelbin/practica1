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
public class Sintonizador {
    
    private static final double FRECUENCIA_MINIMA=80;
    private static final double FRECUENCIA_MAXIMA=108;
    private static final double SALTO=0.5;
    private double frecuenciaActual=FRECUENCIA_MINIMA;
    
    
    public void up(){
        frecuenciaActual=frecuenciaActual>=FRECUENCIA_MAXIMA?FRECUENCIA_MINIMA:frecuenciaActual+SALTO;
    }
    
    
      public void down(){
        frecuenciaActual=frecuenciaActual<FRECUENCIA_MAXIMA?FRECUENCIA_MAXIMA:frecuenciaActual-SALTO;
    }
      
      public double getFrecuenciaActual(){
          return frecuenciaActual;
      }
      
      public static void main(String[] args) {
        Sintonizador sintonizador= new Sintonizador();
        
          System.out.println("Frecuencia inical :"+sintonizador.getFrecuenciaActual());
          
          sintonizador.up();
          sintonizador.up();
          sintonizador.up();
          sintonizador.up();
          sintonizador.up();
          sintonizador.up();
          
          System.out.println("Frecuencia actual luego de subir 6 veces: "+sintonizador.getFrecuenciaActual());
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          sintonizador.down();
          
          System.out.println("Frecuencia luego de bajar  8 veces "+sintonizador.getFrecuenciaActual());
                  
    }
}
