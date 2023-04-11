package com.mycompany.factorymethod;

public class FabricaCaminhao implements FabricaTransporte {
    @Override
    public Transporte criarTransporte(){
        return new Caminhao();
    }   
}
