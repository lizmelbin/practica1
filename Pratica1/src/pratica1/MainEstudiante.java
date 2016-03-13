/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica1;

import java.util.Date;

/**
 *
 * @author user
 */
public class MainEstudiante {
    
    
    public static void main(String[] args) {
        Estudiante e1= new Estudiante();
         Estudiante e2= new Estudiante();
         Estudiante e3= new Estudiante();
         Estudiante e4= new Estudiante();
         Estudiante e5= new Estudiante();
         

         e1.setApellido("Tejada");
         e2.setCarrera("ITT");
         e3.setFechaEntrada(new Date());
         e4.setMatricula("2006-2123");
         e5.setNombre("Liz");
         
         
         String e1Apellido=e1.getApellido();
         String e2Carrera=e2.getCarrera();
         Date e3FechaEntrada=e3.getFechaEntrada();
         String e4Matricula=e4.getMatricula();
         String e5Nombre=e5.getNombre();
         
         System.out.printf("e1Apellido: %s-->\n"
                 + "e2Carrera: %s-->\n"
                 + "e3FechaEntrada: %s-->\n"
                 + "e4Matricula: %s-->\n"
                 + "e5Nombre: %s-->\n",e1Apellido,e2Carrera,e3FechaEntrada,e4Matricula,e5Nombre);
         
         
    }
}
