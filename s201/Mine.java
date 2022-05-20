package com.example.s201;

public class Mine extends Element {

    public int numero;
    public Element.minerai minerai;
    public int resteMinerai;


    public Mine() {
        this.numero= 0;
        this.minerai= Element.minerai.Or;
        this.resteMinerai= 0;
    }

    public Mine(int Nnumero, minerai Nminerai, int NresteMinerai) {
        this.numero= Nnumero;
        this.minerai= Nminerai;
        this.resteMinerai= NresteMinerai;
    }

}
