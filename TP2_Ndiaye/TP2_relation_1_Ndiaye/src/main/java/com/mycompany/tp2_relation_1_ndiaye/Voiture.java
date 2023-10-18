/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp2_relation_1_ndiaye;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String a, String b, int c, Personne h){
        Modele=a;
        Marque=b;
        PuissanceCV=c;
        proprietaire = null;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
}

