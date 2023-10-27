/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_ndiaye_version_console;

/**
 *
 * @author redou
 */
public class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse() {
        this.etat = false;
    }
    public void activerCellule(){
        if (etat = true){
            etat = false;
        }
        if (etat = false){
            etat = true;
        }
    }
    public void eteindreCellule(){
        if ( etat = true){
            etat = false;
        }
    }
    public boolean estEteint(){
        if (etat = false){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean getEtat(){
        if (etat = true){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String x;
         if (etat = true){
            x = "X";
        }
        else {
            x = "O";
        }
        return x ;
    }
    
}

