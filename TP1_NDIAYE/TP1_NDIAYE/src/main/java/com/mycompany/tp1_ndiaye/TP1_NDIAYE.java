/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp1_ndiaye;

import java.util.Scanner;

/**
 *
 * @author redou
 */
public class TP1_NDIAYE {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int nb1;
        int nb2;
        System.out.println("\nEntrer la premiere valeur :");
        nb1 = sc.nextInt(); 
        System.out.println("\nLa premiere valeur est " + nb1);
        System.out.println("\nEntrer la deuxieme valeur :");
        nb2 = sc.nextInt(); 
        System.out.println("\nLa deuxieme valeur est " + nb2);
        int somme= nb1 + nb2;
        int difference = nb1 - nb2;
        int produit = nb1 * nb2;
        int quotient = nb1/nb2;
        int reste = nb1%nb2;
        System.out.println("\nLeur somme: " + somme + "\nLeur difference: " + difference + "\nLeur produit: " + produit + "\nLeur quotient: " + quotient + " avec un reste de: " + reste);
    }
}
