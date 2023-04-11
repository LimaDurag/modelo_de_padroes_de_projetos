package com.mycompany.factorymethod;

public class FabricaNavio implements FabricaTransporte {
    @Override
    public Transporte criarTransporte(){
        return new Navio();
    }
    
}
