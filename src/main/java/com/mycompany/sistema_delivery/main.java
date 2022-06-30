package com.mycompany.sistema_delivery;

import com.mycompany.descontos.descontoCategoria;
import com.mycompany.descontos.descontoEspecifico;
import com.mycompany.descontos.promocaoNatal;
import com.mycompany.impostos.ICMS;
import com.mycompany.impostos.ISS;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        double valorProduto = 100;
        
        double valorProduto_PromocaoNatal = new promocaoNatal(LocalDate.of(2022, 12, 25)).calculaDesconto(valorProduto);
        System.out.println("Valor do produto com desconto de natal: " + valorProduto_PromocaoNatal);
        
        double valorProduto_DescontoEspecifco = new descontoEspecifico("Lápis").calculaDesconto(valorProduto);
        System.out.println("Valor do produto com desconto específico: " + valorProduto_DescontoEspecifco);
        
        double valorProduto_DescontoCategoria = new descontoCategoria("Papelaria").calculaDesconto(valorProduto);
        System.out.println("Valor do produto com desconto por categoria: " + valorProduto_DescontoCategoria);
        
        double valorProduto_ISS = new ISS().calculaImposto(valorProduto);
        System.out.println("Valor do produto com imposto ISS: " + valorProduto_ISS);
        
        double valorProduto_ICMS = new ICMS().calculaImposto(valorProduto);
        System.out.println("Valor do produto com imposto ICMS: " + valorProduto_ICMS);
    }
}
