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
public class OrdenNumerico {
    public static void main(String[] args) {
        args= new String[]{"21","23","1"};
        if(args.length>3 || args.length<3){
            
            System.out.println("No especificaste 3 valores");
            return ;
        }else{
            try{
                double val0=Double.valueOf(args[0]);
                double val1=Double.valueOf(args[1]);
                double val2=Double.valueOf(args[2]);
                
                if(val0<val1&& val1<val2){
                    System.out.println("Las cantidades introducida están en orden numérico");
                }else{
                    System.out.println("Las cantidades introducida no están en orden numérico");
                   double menor=val0<val1?(val0<val2?val0:val2):(val1<val2?val1:val2);
                    double mayor=val0>val1?(val0>val2?val0:val2):(val1>val2?val1:val2);
                    double medio;
                    if(menor==val0&&mayor==val1||menor==val1&&mayor==val0){
                        medio=val2;
                    }else if(menor==val1&&mayor==val2||menor==val2&&mayor==val1){
                        medio=val0;
                    }else if(menor==val2&&mayor==val0||menor==val0&&mayor==val2){
                        medio=val1;
                    } 
                    
                    else {
                        medio=val2;
                    }
                    System.out.println("El orden correcto es "+menor+" "+medio+" "+mayor);
                    
            }
            }catch(Exception e){
                System.err.println("Al menos uno de los valores no es válido");
            }
        }
        
        
    }
 
   
}
