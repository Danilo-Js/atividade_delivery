package com.mycompany.descontos;

import java.time.LocalDate;

public class promocaoNatal implements IDesconto {
    
    private LocalDate dataCompra;
    
    public promocaoNatal(LocalDate dataCompra) {
       this.dataCompra = dataCompra;
    }
    
    public double calculaDesconto(double valorProduto) {
        if (dataCompra.getMonthValue() == 12 && dataCompra.getDayOfMonth() == 25) {
            return valorProduto - valorProduto * 0.03;
        } else return valorProduto;
    }
}
