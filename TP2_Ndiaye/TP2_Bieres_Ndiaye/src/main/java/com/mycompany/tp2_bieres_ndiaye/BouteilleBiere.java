package com.mycompany.tp2_bieres_ndiaye;

/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

/**
 *
 * @author redou
 */

import java.util.Scanner;

public class BouteilleBiere{ 
    public String nom ;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
    
    public void lireEtiquette() {
      System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
     public boolean Decapsuler(){  
        
        if (!ouverte){
            ouverte = true;
            return true;
        }else{
            System.out.println("Erreur, la bière est déjà ouverte");
            return false;
        }
        
    }
    @Override
    public String toString() {      //redfinition de la méthode toString qui retourne certaines caractéristiques de l'objet
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
        if (ouverte == true ){ chaine_a_retourner += "oui" ;}
        else {chaine_a_retourner += "non" ;}
        return chaine_a_retourner ;
    }

    
}

