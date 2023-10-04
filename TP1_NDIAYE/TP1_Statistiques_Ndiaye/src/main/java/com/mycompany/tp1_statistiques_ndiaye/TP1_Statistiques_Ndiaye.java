/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp1_statistiques_ndiaye;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class TP1_Statistiques_Ndiaye {

    public static void main(String[] args) {
          Scanner sc;
      sc = new Scanner(System.in);
      Random generateurAleat = new Random();
      int Tab[] = new int[6];
      System.out.println("\nVeuillez rentrer un nombre entier");
      int nb = sc.nextInt();
      int i = 1;
      for (i=0; i<nb; i++){
       int n = generateurAleat.nextInt(5);
       System.out.println(n);
       Tab[n]+=100.00/nb;
      }
      System.out.println("Voici le Tableau:\n" + Tab[0]+"\n" + Tab[1]+"\n" + Tab[2]+"\n" + Tab[3]+"\n" + Tab[4]+"\n" + Tab[5]);
    }
}
