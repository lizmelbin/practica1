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
public class Mi_Clase {
    
    
    private static int valor_clase=0;
    private  int  valor_instancia=0;
    
    
    public Mi_Clase(){
        valor_clase++;
    }
    
    /**
     * @return the valor_clase
     */
    public static int getValor_clase() {
        return valor_clase;
    }
  

    /**
     * @return the valor_instancia
     */
    public int getValor_instancia() {
        return valor_instancia;
    }
    
    public void setValor_instancia(int valor_instancia){
        
        this.valor_instancia=valor_instancia;
    }
    public static void setValor_clase(int valor_clase1){
        
        valor_clase=valor_clase1;
    }
    
    public static void main(String[] args) {
        
        Mi_Clase m1,m2,m3,m4,m5,m6,m7;
        
        System.out.println("Valor de clase "+Mi_Clase.getValor_clase());
        m1= new  Mi_Clase();
        System.out.println("Valor de clase "+Mi_Clase.getValor_clase());
        
        m2= new  Mi_Clase();
        System.out.println("Valor de clase "+Mi_Clase.getValor_clase());
        
         m3= new  Mi_Clase();
        System.out.println("Valor de instancia m3 "+m3.getValor_instancia());
        
        
        m3.setValor_instancia(100);
        System.out.println("Valor de instancia m3 "+m3.getValor_instancia());
        
        
    }
}
