/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp3_heroic_fantasy_ndiaye;
import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author redou
 */
public class TP3_Heroic_Fantasy_Ndiaye {

    public static void main(String[] args) {
        Epee Excalibur = new Epee ("Excalibur",7,5);
        Epee Durandal = new Epee ("Durandal",7,5);
        Baton Chene = new Baton ("Chene",4,5);
        Baton Charme = new Baton ("Charme",5,6);
        ArrayList<Arme> lst_armes = new ArrayList<Arme>();
        lst_armes.add(Excalibur);
        lst_armes.add(Durandal);
        lst_armes.add(Chene);
        lst_armes.add(Charme);
        lst_armes.size();
        System.out.println(lst_armes);
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        ArrayList<Personnage> lst_personnages = new ArrayList<Personnage>();
        lst_personnages.add(Gandalf);
        lst_personnages.add(Garcimore);
        lst_personnages.add(Conan);
        lst_personnages.add(Lannister);
        lst_personnages.size();
        System.out.println(lst_personnages);
    }
}
