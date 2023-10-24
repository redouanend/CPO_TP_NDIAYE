/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import Personnage.Personnage;

/**
 *
 * @author redou
 */
public class Magicien extends Personnage {
    boolean Conf;
    String niveau;
    static int nb_magiciens = 0;


    public void setConf(boolean Conf) {
        this.Conf = Conf;
    }
    public Magicien(String nom, int nvVie,Arme Aenmain, boolean Conf) {
        super(nom, nvVie,Aenmain);
        nb_magiciens++;
    }
}
