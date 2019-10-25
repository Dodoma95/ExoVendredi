/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exo;

/**
 *
 * @author Administrateur
 */
public class tableauSomme {
    
       public static void main(String[] args) {
           int tableau[] = {5,78,23,13,12,56};
           
           //int result = calculSomme(tableau);
           
           //System.out.println(result);
    }
 
       public int calculSomme(int tableau[]) {
           int sommeTableau = 0;
           int i = 0;
           //int tableau[] = {5,78,23,13,12,56};
           
           for (i = 0; i<tableau.length; i++) {
               sommeTableau += tableau[i];
           }
           
           return sommeTableau;
       }
    
}
   
