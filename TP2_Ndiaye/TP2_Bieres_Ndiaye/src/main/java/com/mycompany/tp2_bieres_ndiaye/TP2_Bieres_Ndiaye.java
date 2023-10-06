/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp2_bieres_ndiaye;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class TP2_Bieres_Ndiaye {

    public static void main(String[] args) {
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
       uneBiere.lireEtiquette();
       
       BouteilleBiere Biere2 = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
       Biere2.lireEtiquette();
       
       uneBiere.Decapsuler();
       Biere2.Decapsuler();
    }               
}
