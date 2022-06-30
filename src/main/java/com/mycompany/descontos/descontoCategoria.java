package com.mycompany.descontos;

public class descontoCategoria implements IDesconto {
    
    private String categoria;
    
    public descontoCategoria (String categoria) {
       this.categoria = categoria;
    }
    
    public double calculaDesconto(double valorProduto) {
        if (categoria.equals("Papelaria")) {
            return valorProduto - valorProduto * 0.01;
        }
        return valorProduto;
    }
}
