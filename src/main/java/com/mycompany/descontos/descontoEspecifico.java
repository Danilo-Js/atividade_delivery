package com.mycompany.descontos;

public class descontoEspecifico implements IDesconto {
    
    private String nomeProduto;
    
    public descontoEspecifico(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public double calculaDesconto(double valorProduto) {
        if (nomeProduto.equals("Lápis")) {
            return valorProduto - valorProduto * 0.005;
        }
        return valorProduto;
    }
}
