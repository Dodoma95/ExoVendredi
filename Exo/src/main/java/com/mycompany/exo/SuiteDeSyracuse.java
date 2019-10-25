
package com.mycompany.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SuiteDeSyracuse {
    
    public List<Integer> calculerSuiteSyracuse(int u){
        
        List<Integer> liste = new ArrayList<Integer>();

        int un = u; 
        int n = 0; 
        int tmax = u; 
        for (int i = 0; i < 20; i++) {
            un = (un % 2 == 0 ? un / 2 : 3 * un + 1);
            liste.add(un);
        }               
      return liste;
        
   }
    public static void main(String[] args) {
        
        SuiteDeSyracuse ss = new SuiteDeSyracuse();
        List<Integer> ll = ss.calculerSuiteSyracuse(11);
        for(int nb: ll){
            System.out.println(nb);
        }
    }
}
