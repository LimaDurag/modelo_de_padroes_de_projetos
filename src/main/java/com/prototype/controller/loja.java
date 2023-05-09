package com.prototype.controller;

import com.prototype.model.Automovel;;

public class loja {
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Automovel a = new Automovel();

        a.setMarca("Chevrolet");

        a.setModelo("Celta");

        a.setTipo("Passeio");

        System.out.println("Marca: " + a.getMarca() + " Modelo: " + a.getModelo() + " Tipo: " + a.getTipo());

        Automovel b = a.clone();

        System.out.println("Marca: " + b.getMarca());

        b.setModelo("Montana");

        b.setModelo("Montana");
        System.out.println("Marca:" + b.getMarca() + " Modelo: " + b.getModelo() + " Tipo: " + b.getTipo());

    }

}
