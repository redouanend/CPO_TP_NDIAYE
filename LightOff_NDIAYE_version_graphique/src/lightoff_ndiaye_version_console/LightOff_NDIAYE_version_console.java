/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_ndiaye_version_console;

import java.util.Scanner;

/**
 *
 * @author redou
 */
public class LightOff_NDIAYE_version_console {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le Jeu");
        Scanner sc = new Scanner(System.in);
        System.out.println("De quel taille voulez-vous votre grille?\n" + "1)Facile 6X6\n" + "Moyenne 8X8\n" + "Difficile 10X10");
        int y = sc.nextInt();
        int t = 0;
        if (y == 1){
            t = 6;
        }
        if (y == 1){
            t = 8;
        }
        if (y == 1){
            t = 10;
        }
        GrilleDeJeu grille = new GrilleDeJeu(t,t);
        Partie partie = new Partie(grille);
        partie.initialiserPartie();
        int x = partie.TypeDiff();
        partie.lancerPartie(x);

    }
    
}
