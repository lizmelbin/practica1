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
public class Bombilla {
    
    private static boolean hayLuz=true;
    private boolean interructorEncendido=true;
    
    
    
    /**
     * @return the hayLuz
     */
    public static boolean isHayLuz() {
        return hayLuz;
    }

    /**
     * @param aHayLuz the hayLuz to set
     */
    public static void setHayLuz(boolean aHayLuz) {
        hayLuz = aHayLuz;
        
    }
    
    

    /**
     * @return the interructorEncendido
     */
    public boolean isInterructorEncendido() {
        return interructorEncendido;
    }

    /**
     * @param interructorEncendido the interructorEncendido to set
     */
    public void setInterructorEncendido(boolean interructorEncendido) {
        this.interructorEncendido = interructorEncendido;
         
    }

    /**
     * @return the bombillaEncendida
     */
    public boolean isBombillaEncendida() {
        return interructorEncendido&&hayLuz;
    }

    
    

    public static void main(String[] args) {
        
        Bombilla b1,b2,b3;
        
        b1=new Bombilla();
        b2=new Bombilla();
        b3=new Bombilla();
        
        
        System.out.println("Bombilla 1 encendida? "+b1.isBombillaEncendida());
        System.out.println("Apagando bombilla 1...");
        b1.setInterructorEncendido(false);
        System.out.println("Bombilla 1 encendida? "+b1.isBombillaEncendida());
        System.out.println("Bombilla 2 encendida? "+b2.isBombillaEncendida());
        System.out.println("Apagando bombilla 2...");
        b2.setInterructorEncendido(false);
        System.out.println("Bombilla 2 encendida? "+b2.isBombillaEncendida());
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
        System.out.println("Apagando bombilla 3...");
        b3.setInterructorEncendido(false);
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
        
        System.out.println("Encendiendo todas las  bombillas...");
        b1.setInterructorEncendido(true);
        b2.setInterructorEncendido(true);
        b3.setInterructorEncendido(true);
        System.out.println("Bombilla 1 encendida? "+b1.isBombillaEncendida());
        System.out.println("Bombilla 2 encendida? "+b2.isBombillaEncendida());
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
        
         
         System.out.println("Apagando bombilla 3...");
        b3.setInterructorEncendido(false);
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
        
        System.out.println("Se fue la luz... ");
        
        Bombilla.setHayLuz(false);
        
        System.out.println("Bombilla 1 encendida? "+b1.isBombillaEncendida());
        System.out.println("Bombilla 2 encendida? "+b2.isBombillaEncendida());
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
        
        System.out.println("Llego la luz... ");
        
        Bombilla.setHayLuz(true);
        
        System.out.println("Bombilla 1 encendida? "+b1.isBombillaEncendida());
        System.out.println("Bombilla 2 encendida? "+b2.isBombillaEncendida());
        System.out.println("Bombilla 3 encendida? "+b3.isBombillaEncendida());
    }
}
