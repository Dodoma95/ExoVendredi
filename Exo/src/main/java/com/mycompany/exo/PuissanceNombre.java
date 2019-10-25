
package com.mycompany.exo;


public class PuissanceNombre {

    public int calculerPuissanceNombre(int x, int n) {
     
        int y = 1;
        for(int i = 1; i<= n; i++){ 
            if(n != 1) 
                y = y * x; 
            else 
                y = x; 
        }
        return y;
    }    

    public static void main(String[] args) {
        
        PuissanceNombre p = new PuissanceNombre();
        int result = p.calculerPuissanceNombre(4, 4);
        System.out.println(result);
    }
}
