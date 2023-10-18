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
public class Personne {
    String nom;
    String prenom;
   int nbVoitures=0;
    Voiture [] liste_voitures;
    
    public Personne(String d, String e, int f){
        nom=d;
        prenom=e;
        nbVoitures=f;
        liste_voitures = new Voiture[3];
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.proprietaire!= null){
            System.out.println("voiture volée !!");
        }
        if (this.nbVoitures>=3){
            return false;
        }
        else {
            liste_voitures[nbVoitures]= voiture_a_ajouter;
            nbVoitures++;
            voiture_a_ajouter.proprietaire=this;
            return true;
        }
    }
        
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
