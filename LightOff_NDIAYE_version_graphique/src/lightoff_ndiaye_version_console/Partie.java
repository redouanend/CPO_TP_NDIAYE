/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_ndiaye_version_console;

import java.util.Scanner;

/**
 *
 * @author redou
 */

public class Partie {
    GrilleDeJeu grille;
    int nbCoups;

    public Partie(GrilleDeJeu grille) {
        this.grille = grille;
    }
    public int TypeDiff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir le nombre de coups autorisé:\n"+ "1)Facile 25 coups\n" + "2)Moyen  20 coups\n" + "3)Difficile  14 coups\n");
        int nv = sc.nextInt();
        return nv;
       }
    
    public void CoupsAuto(int nv){
        if (nv == 1){
            if (nbCoups > 25){
                 System.out.println("Vous avez perdu le jeu.");
                 System.exit(1);
            }
        }
        if (nv == 2){
            if (nbCoups > 20){
                 System.out.println("Vous avez perdu le jeu.");
                 System.exit(1);
            }
        }
        if (nv == 3){
            if (nbCoups > 14){
                 System.out.println("Vous avez perdu le jeu.");
                 System.exit(1);
            }
        }
    }
            
    public void initialiserPartie(){
        Scanner sc = new Scanner(System.in);
        int nbCoups = 0;
        System.out.println("Niveau Mélange:\n"+ "1)Facile 5 mix\n" + "2)Moyen  8 mix\n" + "3)Difficile  10 mix\n");
        int nv = sc.nextInt();
        if (nv == 1){
            nbCoups = 5;
        }
        if (nv == 2){
          nbCoups = 8;
        }
        if (nv == 3){
            nbCoups = 10;
        }
        grille.melangerMatriceAleatoirement( nbCoups);
    }
    public void lancerPartie(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println(grille);
        while(!grille.cellulesToutesEteintes()){
            System.out.println("Veuillez saisir:\n"+ "1)Activer Ligne\n" + "2)Activer Colonne\n" + "3)Activer Diagonale descendante\n" + "4)Activer Diagonale montante");
            int Coup = sc.nextInt();
            nbCoups ++;
            if (Coup == 1){
                System.out.println("Quels lignes?");
                int ligne = sc.nextInt();
                grille.activerLigneDeCellules(ligne);
            }
            if (Coup == 2){
                System.out.println("Quels colonnes?");
                int colonne = sc.nextInt();
                grille.activerColonneDeCellules(colonne);
            }
            if (Coup == 3){
                grille.activerDiagonaleDescendante();
            }
            if (Coup == 4){
                grille.activerDiagonaleMontante();
            }
            System.out.println(grille);
            CoupsAuto(x);
        }
        System.out.println("Felicitations vous avez gagné le jeu en "+nbCoups+" coups");
    }
}
