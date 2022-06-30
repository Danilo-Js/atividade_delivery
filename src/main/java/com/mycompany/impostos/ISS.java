package com.mycompany.impostos;

public class ISS implements IImposto {
    
    public double calculaImposto(double valorProduto) {
        return valorProduto + valorProduto * 2 / 100;
    }
}
