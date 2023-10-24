/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.*;
import java.util.ArrayList;
/**
 *
 * @author redou
 */
public abstract class Personnage {
    String nom;
    int nvVie;
    Arme Aenmain;
    public String nomPersonnage(){
        return nom;
    }
    public int nvVie(){
        return nvVie;
    }

    public Personnage(String nom, int nvVie, Arme Aenmain) {
        this.nom = nom;
        this.Aenmain = null;
        if (nvVie <= 100){
        this.nvVie = nvVie;
        }
        else {
        System.out.println("Erreur veuillez entrer un nombre inférieur à 100");
        }
        }
    
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", nvVie=" + nvVie + '}';
    }
    
    ArrayList<Arme> Armes_perso = new ArrayList <Arme>();
    public void addArme(Arme arme){
        if(Armes_perso.size()<5){
            Armes_perso.add(arme);
        }
    }

    public Arme getAenmain() {
        return Aenmain;
    }
    
}
