package com.example.s201;

public class Monde {

    public Secteur[][] matriceMap;

    public Monde() {
        this.matriceMap= new Secteur[10][10];
    }

    public void afficherMap() {
        for (int i = 0; i < matriceMap.length; i++) {

            for (int j = 0; j < matriceMap[0].length; j++) {
                matriceMap[i][j].afficherSecteur();
            }
            System.out.print("\n");
        }

    }
}
