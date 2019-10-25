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
public class DessinEtoile {
    
    public void dessinEtoile() {
    String etoiles = "*";
    
    for (int i = 0; i < 6; i++){
       for (int j = 0; j <i+1; j++){
           System.out.print(etoiles);
       }
        System.out.println();
    }
   
}   
    public static void main(String[] args) {
        //String etoiles = "*\n" + "**\n" + "***\n" + "****\n" + "*****\n" + "******\n";
        //System.out.println(etoiles);
        String etoiles = "*";
        DessinEtoile de = new DessinEtoile();
        //String result = de.de
    }
}
