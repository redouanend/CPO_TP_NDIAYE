/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
/**
 *
 * @author redou
 */
public abstract class Personnage {
    String nom;
    int nvVie;
    Arme Aenmain;
    public static int nb_perso;
    
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
    public String EquiperPerso(Arme arme){
        if (Armes_perso.contains(arme)) {
            int i=0;
            while (arme != Armes_perso.get(i)){
                i++;
            }
            Aenmain=Armes_perso.get(i);
        
            return this.nom +" porte cette arme : "+ Aenmain;
        } else {
            return "Action impossible, votre personnage ne possède pas cette arme.";
        }
    }
    public void nb_personnages(){
    nb_perso = Magicien.nb_magiciens + Guerrier.nb_guerriers;
    }
    @Override
        public void finalize(){
        nb_perso--;
    }
    
    public void seFatiguer(){
        nvVie = nvVie-10;
    }
    
    public boolean estVivant(){
        if (nvVie<0){
            return false;
        } else {
            return true;
        }
    }
    
    public void estAttaqué(int points){
        nvVie=nvVie-points;
    }

    public void Attaquer(Personnage perso){
        if (this instanceof Magicien){
            if (this.Aenmain instanceof Baton){
                if (((Guerrier)perso).cheval == true){
                    perso.estAttaqué(Aenmain.nvAttaque * ((Baton)Aenmain).age /2);
                } else {
                    perso.estAttaqué(Aenmain.nvAttaque * ((Baton)Aenmain).age);
                }
            }
        } if (this instanceof Guerrier){
            if (this.Aenmain instanceof Epee){
                if (((Magicien)perso).Conf == true){
                    perso.estAttaqué(Aenmain.nvAttaque * ((Epee)Aenmain).indice /2);
                } else {
                    perso.estAttaqué(Aenmain.nvAttaque * ((Epee)Aenmain).indice);
                }
            }
        }
        this.seFatiguer();
    }
}
