/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */
package Armes;
import Armes.Arme;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class Baton extends Arme{
    int age;

    public Baton(String nom,int nvAttaque,int age) {
        super(nom,nvAttaque);
        if (age < 100){
        this.age = age;
        }
        else{
        System.out.println("Erreur veuillez entrer un nombre inférieur à 100");
        }
    }
    
}
