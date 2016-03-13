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
public class Circulo {
    
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(){
        return Math.PI*radio*radio;
    }
     public double getPerimetro(){
        return 2*Math.PI*radio;
    }
     
     public static void main(String[] args) {
        Circulo cir= new Circulo(12);
        
         System.out.println("Area: "+cir.getArea()+"\nPerimetro: "+cir.getPerimetro());
    }
    
}
