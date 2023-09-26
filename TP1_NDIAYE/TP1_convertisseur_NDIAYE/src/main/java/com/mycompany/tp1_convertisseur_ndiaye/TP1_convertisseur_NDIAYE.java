/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp1_convertisseur_ndiaye;

import java.util.Scanner;

/**
 *
 * @author redou
 */
public class TP1_convertisseur_NDIAYE {

    public static void main(String[] args) {
       Scanner sc;
       sc = new Scanner(System.in);
       System.out.println("Bonjour, veillez rentrer une  valeur.");
       double val1 = sc.nextDouble();
       System.out.println("\nVotre valeur est: " + val1);
       double conv = 273.15 + val1;
       System.out.println("\nLa temperature en Kelvin est: " + conv);
    }
   public static double CelciusVersKelvin (double tCelcius) {
       double conv = 273.15 + val1;
       System.out.println("\nLa temperature en Kelvin est: " + conv);
    }
    public static double KelvinVersCelcius (double tCelcius) {
       double conv = -273.15 + val1;
       System.out.println("\nLa temperature en Celcius est: " + conv);
    }
}