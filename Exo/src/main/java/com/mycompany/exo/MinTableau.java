
package com.mycompany.exo;


public class MinTableau {
    
    public int calculerMinTab(int [] tab){
        
        int min = tab[0];
        
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] <= min) {
                min = tab[i];
            }
        }
    return min;
    }
}
