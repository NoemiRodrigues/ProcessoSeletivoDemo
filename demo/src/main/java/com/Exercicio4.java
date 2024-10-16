package com;
public class Exercicio4 {
    public Exercicio4(){
       
    }
    public void ex4Result(){
        double saoPaulo = 67836.43;
        double riodeJaneiro = 36678.66;
        double minasGerais = 29229.88;
        double espiritoSanto = 27165.48;
        double outros = 19849.53;
        double somaEstados = 0;
        double valorTotal = saoPaulo+ riodeJaneiro + minasGerais + espiritoSanto + outros;
        double percentualEstado = 0;


        double[] estados = {saoPaulo, riodeJaneiro, minasGerais, espiritoSanto, outros};
        String[] nomeEstados = {"São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo", "Outros"};
        
        System.out.println("Resultados ex4: ");
        for (int i = 0; i < estados.length; i++){
            percentualEstado = calcularPorcentagem(estados[i], valorTotal);
        
            System.out.printf("%s: %.2f%%%n", nomeEstados[i], percentualEstado);

        }
    }
      
private double calcularPorcentagem(double nrparaCalculo, double valorTotal) {
    double resultado;

    resultado = ((nrparaCalculo / valorTotal)* 100);
    return resultado;


    }

}