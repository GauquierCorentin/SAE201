package com.example.s201;

public class Main {

    public static void main(String[] args) {

        Monde mars= new Monde();

        Secteur secteur1= new Secteur();

        int i;
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < 10; j++) {
                mars.matriceMap[k][j]= new Secteur();
            }
        }
        //Mars.matriceMap[0][0].afficherSecteur();
        mars.afficherMap();

        Robot robot= new Robot(Element.minerai.Or, 20,3);

    }
}
