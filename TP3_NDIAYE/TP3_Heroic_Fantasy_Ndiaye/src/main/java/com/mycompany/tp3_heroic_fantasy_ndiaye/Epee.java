/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */
package com.mycompany.tp3_heroic_fantasy_ndiaye;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class Epee extends Arme{
    int indice;

    public Epee(String nom,int nvAttaque,int indice) {
        super(nom,nvAttaque);
        if (indice < 100){
        this.indice = indice;
        }
        else{
        System.out.println("Erreur veuillez entrer un nombre inférieur à 100");
        }
    }
    
}