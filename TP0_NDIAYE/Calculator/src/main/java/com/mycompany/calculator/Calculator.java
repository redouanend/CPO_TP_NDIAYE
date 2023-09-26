/*Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author redou
 */
public class Calculator {

        @SuppressWarnings("empty-statement")
        public static void main(String[] args) {
        int operande1; 
        int operande2; 
        int operateur;
        int result = 0;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer l'operateur :\n" + "1) add\n" + "2) substract\n" + "3) multiply\n" + "4) divide\n" + "5) modulo");
        operateur = sc.nextInt(); 
        while (operateur > 5){
            System.out.println("Erreur veuillez ecrire un chiffre entre 1 et 5");
            System.exit(0);
        };
        while (operateur < 1){
            System.out.println("Erreur veuillez ecrire un chiffre entre 1 et 5");
            System.exit(0);
        };
        System.out.println("\nEntrer la premiere valeur :");
        operande1 = sc.nextInt(); 
        System.out.println("\nEntrer la deuxieme valeur :");
        operande2 = sc.nextInt(); 
        
        if (operateur==1){
            result= operande2 + operande1;
        }
        if (operateur==2){
            result= operande2-operande1;
        }
        if (operateur==3){
            result= operande2*operande1;
        }
        if (operateur==4){
            result= operande2/operande1;
        }
        if (operateur==5){
            result= operande2%operande1;
        }
        System.out.println("\nLe ésultat est:" + result);
    }
}



