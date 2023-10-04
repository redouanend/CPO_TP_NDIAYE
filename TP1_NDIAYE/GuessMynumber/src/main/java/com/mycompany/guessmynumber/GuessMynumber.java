/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.guessmynumber;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author redou
 */
public class GuessMynumber {

    public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      Random generateurAleat = new Random();
      System.out.println("\nChoisissez le niveau de difficulté\n" + "1)facile\n" + "2)moyen\n" + "3)difficile");
      int level = sc.nextInt();
      int essai= 0;
      int n = generateurAleat.nextInt(100);
      int nb = -1;
      if (level == 1){
      while (nb != n){
         System.out.println("veuillez saisir un nombre");
         nb = sc.nextInt(); 
         if (nb < n){System.out.println("trop petit");}
         if (nb > n) {System.out.println("trop grand");}
         if (nb < n-20) {System.out.println("beaucoup trop même");}
         if (nb > n+20) {System.out.println(" beaucoup trop même");}
         essai += 1;
      }
      System.out.println("\nC'est gagné au bout de " + essai + "essai");
      }
      if (level == 3){
      while (nb != n){
         System.out.println("veuillez saisir un nombre");
         nb = sc.nextInt(); 
         if (nb < n){System.out.println("trop petit");}
         if (nb > n) {System.out.println("trop grand");}
         essai += 1;
         if (essai > 8){
             System.out.println("\nC'est perdu au bout de " + essai + "essai");
             break;}
      }
      System.out.println("\nC'est gagné au bout de " + essai + "essai");
      }
      if (level == 3){
      while (nb != n){
         System.out.println("veuillez saisir un nombre");
         nb = sc.nextInt(); 
         if (nb < n){System.out.println("trop petit");}
         if (nb > n) {System.out.println("trop grand");}
         essai += 1;
      }
      System.out.println("\nC'est gagné au bout de " + essai + "essai");
      }
      }
}
