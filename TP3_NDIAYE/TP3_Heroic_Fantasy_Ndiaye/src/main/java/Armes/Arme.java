/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author redou
 */
public abstract class Arme {
    String nom ;
    int nvAttaque;
    
    public String nomArme(){
        return nom;
    }
    public int nvAttaque(){
        return nvAttaque;
    }

    public Arme(String nom, int nvAttaque) {
        this.nom = nom;
        if (nvAttaque <= 100){
        this.nvAttaque = nvAttaque;
        }
        else {
        System.out.println("Erreur veuillez entrer un nombre inférieur à 100");
        }
        }
    
    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", nvAttaque=" + nvAttaque + '}';
    }
    
}
