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
public class MainEdificio {
    

    public static void main(String[] args) {
        Edificio edificio=new  Edificio(10, 40, "Primer eedificio");
        
        
        System.out.println("Nombre: "+edificio.getNombre()+"\n"
                + "Pisos: "+edificio.getPisos()
                +"\nPuertas: "+edificio.getPuertas()
        );
        
        edificio.setNombre("Nuevo nombre");
        edificio.setPisos(5);
        edificio.setPuertas(18);
        System.out.println("");
        System.out.println("========Cambiando edificio========");
        System.out.println("");
        System.out.println("Nombre: "+edificio.getNombre()+"\n"
                + "Pisos: "+edificio.getPisos()
                +"\nPuertas: "+edificio.getPuertas()
        );
        
    }


}




