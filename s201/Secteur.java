package com.example.s201;

public class Secteur extends Monde{

    public Element[][] matriceSecteur;

    public Secteur(){
        this.matriceSecteur= new Element[2][2];
    }

    public void afficherSecteur() {
        for (int i = 0; i < matriceSecteur.length; i++) {
            for (int j = 0; j < matriceSecteur[0].length; j++) {
                System.out.print(matriceSecteur[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
