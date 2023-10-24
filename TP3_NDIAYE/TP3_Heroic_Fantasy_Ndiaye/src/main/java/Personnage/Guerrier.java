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
public class Guerrier extends Personnage{
    boolean cheval;
    static int nb_guerriers = 0;
    public Guerrier(String nom, int nvVie,Arme Aenmain, boolean cheval) {
        super(nom, nvVie,Aenmain);
        nb_guerriers++;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}
