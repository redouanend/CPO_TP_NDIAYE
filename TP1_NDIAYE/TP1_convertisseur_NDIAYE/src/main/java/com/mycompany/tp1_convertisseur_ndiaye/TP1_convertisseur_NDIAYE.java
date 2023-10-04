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
       double val2 = 0;
       System.out.println("\n)Saisissez la conversion que vous souhaiter effectuer :\n" +
                                "1) De Celcius vers Kelvin\n" +
                                "2) De Kelvin vers Celcius\n" +
                                "3)FarenheitVersCelcius\n" +
                                "4)CelciusVersFarenheit\n" +
                                "5)KelvinVersFarenheit\n" +
                                "6) De Farenheit vers Kelvin");
       int select = sc.nextInt();
       if (select == 1) { val2 = CelciusVersKelvin(val2);}
       if (select == 2) { val2 = KelvinVersCelcius(val2);}
       if (select == 3) { val2 = FarenheitVersCelcius(val2);}
       if (select == 4) { val2 = CelciusVersFarenheit(val2);}
       if (select == 5) { val2 = KelvinVersFarenheit(val2);}
       if (select == 6) { val2 = FarenheitVersKelvin(val2);}
       System.out.println("\nLa temperature convertie est: " + val2);
    }  
    public static double CelciusVersKelvin (double val1) {
       double conv = 273.15 + val1;
       return conv;
    }
    public static double KelvinVersCelcius (double val1) {
       double conv = -273.15 + val1;
       return conv;   
    }
    public static double FarenheitVersCelcius (double val1) {
       double conv = (val1 - 32) * 5/9;
       return conv;
    }
    public static double CelciusVersFarenheit (double val1) {
       double conv = (val1 * 9 / 5) + 32;
       return conv;
    }
    public static double KelvinVersFarenheit (double val1) {
       double conv = (val1 - 273.15) * 9/5 + 32;
       return conv;   
    }  
    public static double FarenheitVersKelvin (double val1) {
       double conv = 5/ 9 * (val1 - 32) + 273.15 ;
       return conv;
    }
}