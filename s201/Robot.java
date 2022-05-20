package com.example.s201;

public class Robot extends Element{

    public Element.minerai minerai;
    public int capaciteStockage;
    public int stockage;
    public int capaciteExtraction;

    public enum direction{
        Nord,Sud,Est,Ouest;
    }


    public Robot(){
        this.minerai= Element.minerai.Or;
        this.capaciteStockage=0;
        this.stockage=0;
        this.capaciteExtraction=0;
    }

    public Robot(Element.minerai nminerai, int capaciteStockage, int capaciteExtraction){
        this.minerai= nminerai;
        this.capaciteStockage= capaciteStockage;
        this.stockage= 0;
        this.capaciteExtraction= capaciteExtraction;
    }

    public void extraireMinerai(Mine mine){
        if(this.minerai.equals(mine.minerai)){
            if(mine.resteMinerai<this.capaciteExtraction){
                this.stockage+= mine.resteMinerai;
                mine.resteMinerai= 0;
            }else{


                mine.resteMinerai-= this.capaciteExtraction;
            }
        }else{
            System.out.println("Ce robot ne peut pas récolter ce type de minerai");
        }
    }

    public void deposerMinerai(Entrepot entrepot){
        if(this.minerai.equals(entrepot.minerai)) {
            if(this.stockage>0){
                entrepot.stockage+= this.stockage;
                this.stockage= 0;
            }else{
                System.out.println("Il n'y a aucun minerai à déposer");
            }
        }else{
            System.out.println("Cet entrepôt ne peut pas contenir ce type de minerai");
        }
    }

    public void seDeplacer(Robot.direction direction){
        if(direction.equals(Robot.direction.Nord)){

        }

    }
}
