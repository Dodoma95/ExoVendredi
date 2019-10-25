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
public class CalculCombienDeFoisElementTableau {

    public int[] calculCombienDeFoisElementTableau(int tableau[]) {
        int i = 0;
        int element1 = 0;
        int element2 = 0;
        int element3 = 0;
        int element4 = 0;
        int element5 = 0;
        //String resultat = "le chiffre 1 est présent : " + element1 + " fois, le chiffre 2 est présent : " + element2 + " fois, le chiffre 3 est présent : " + element3 + " fois, le chiffre 4 est présent : " + element4 + " fois, le chiffre 5 est présent : " + element5 + " fois";

        for (i = 0; i < tableau.length; i++) {
            switch (tableau[i]) {
                case 1:
                    element1++;
                    break;
                case 2:
                    element2++;
                    break;
                case 3:
                    element3++;
                    break;
                case 4:
                    element4++;
                    break;
                default:
                    element5++;
                    break;
            }
        }
        int resultat[] = {element1,element2,element3,element4,element5};
        return resultat;
    }

    public static void main(String[] args) {
        int i = 0;
        int tableau[] = {1, 4, 3, 3, 4, 2, 2, 2, 4, 1};
        //int[] result = calculCombienDeFoisElementTableau(tableau);
        
        //for (i = 0; i < result.length; i++){
            //System.out.println(result[i]);
        //}
        
    }

}
