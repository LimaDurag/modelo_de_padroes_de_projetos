package com.mycompany.factorymethod;

public class Navio implements Transporte {
    @Override
    public void entregar(){
        System.out.println("Entregando por navio...");
    }
}
