/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Menu {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         String choix1;
        do {          
        System.out.println("************************************************************");
        System.out.println("Veuillez choisir la fonction que vous souhaitez utiliser : ");
        System.out.println("************************************************************");
        System.out.println("1 : Calculer la somme d'un tableau");
        System.out.println("2 : Trouver le plus petit élément d'un tableau");
        System.out.println("3 : Compter le nombre de fois ou un élément d'un tableau est présent");
        System.out.println("4 : Calculer les 20 termes de la suite de Syracuse");
        System.out.println("5 : Afficher à l'écran dessin d'étoiles");
        System.out.println("6 : Calculer la puissance d’un nombre");
        String choix = sc.nextLine();
        //System.out.println("Vous avez saisi : " + choix);
        switch (choix) {

            case "1":
                int tableau[] = {5, 78, 23, 13, 12, 56};
                tableauSomme tab = new tableauSomme();
                int result = tab.calculSomme(tableau);
                System.out.println("la somme des éléments du tableau = " + result);
                break;

            case "2":
                MinTableau min = new MinTableau();
                int tableau1[] = {5, 78, 23, 13, 12, 56};
                int result1 = min.calculerMinTab(tableau1);
                System.out.println("Le plus petit élément du tableau est " + result1);
                break;

            case "3":
                int tableau2[] = {1, 4, 3, 3, 4, 2, 2, 2, 4, 1};
                CalculCombienDeFoisElementTableau tab1 = new CalculCombienDeFoisElementTableau();
                int[] result2 = tab1.calculCombienDeFoisElementTableau(tableau2);
                for (int i = 0; i < result2.length; i++) {

                    System.out.println("nombre " + (i + 1) + " est présent dans le tableau : " + result2[i] + " fois");

                }
                break;

            case "4":
                SuiteDeSyracuse ss = new SuiteDeSyracuse();
                List<Integer> ll = ss.calculerSuiteSyracuse(11);
                for (int nb : ll) {
                    System.out.println(nb);
                }
                break;

            case "5":
                DessinEtoile de = new DessinEtoile();
                de.dessinEtoile();
                break;

            case "6":
                PuissanceNombre ps = new PuissanceNombre();
                int result3 = ps.calculerPuissanceNombre(5, 3);
                System.out.println("le chiffre 5 élévé à la puissance 3 = " + result3);
                break;
               
            default:
                System.out.println("Veuillez saisir un choix compris entre 1 et 6");
                
        }
            System.out.println("Voulez vous recommencer ? O/N");
            choix1 = sc.nextLine();
            
        } while (choix1.equals("O"));
            
        }
    }


