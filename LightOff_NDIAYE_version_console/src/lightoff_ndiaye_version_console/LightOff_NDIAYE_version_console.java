/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_ndiaye_version_console;

/**
 *
 * @author redou
 */
public class LightOff_NDIAYE_version_console {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        GrilleDeJeu grille = new GrilleDeJeu(4,4);
        Partie partie = new Partie(grille);
        partie.initialiserPartie();
        int x = partie.TypeDiff();
        partie.lancerPartie(x);

    }
    
}
