package com.mycompany.factorymethod;

public class Logistica {
    public static void main(String[] args) {
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao();
        FabricaTransporte fabricaNavio = new FabricaNavio();
        
        Transporte caminhao = faricaCaminhao.criarTransporte();
        Caminhao.entregar();
        
        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();
    }
}
