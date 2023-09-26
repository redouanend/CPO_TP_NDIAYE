/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author redou
 */
public class Exo2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        nb=5;
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
        result=result+ind;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
        int nb;
        nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    }
}
