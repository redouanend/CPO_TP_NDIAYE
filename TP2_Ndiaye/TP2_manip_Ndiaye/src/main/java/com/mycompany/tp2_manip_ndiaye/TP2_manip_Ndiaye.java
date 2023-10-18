/*
 *Ndiaye Oumar Redouane 
 *TP0
 * Septembre 2023
 */

package com.mycompany.tp2_manip_ndiaye;
import java.util.Scanner;

/**
 *
 * @author redou
 */
public class TP2_manip_Ndiaye {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        Tartiflette a=assiette1;
        assiette1=assiette2; 
        assiette2=a;
        
        System.out.println("nb de calories de Assiette 1 : "+ assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
                
        Moussaka[] moussakas = new Moussaka[10];
        
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka((i+1)*100);
            System.out.println(moussakas[i].nbCalories);
        }

    }
    
}