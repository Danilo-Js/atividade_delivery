package com.mycompany.impostos;

public class ICMS implements IImposto {
    
    public double calculaImposto(double valorProduto) {
        return valorProduto + valorProduto * 7 / 100;
    }
}
