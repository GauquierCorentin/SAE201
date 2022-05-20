package com.example.s201;

public class Entrepot extends Element{

    public Element.minerai minerai;
    public int stockage;


    public Entrepot(){
        this.minerai= Element.minerai.Or;
        this.stockage= 0;
    }

    public Entrepot(Element.minerai minerai){
        this.minerai= minerai;
        this.stockage= 0;
    }
}
