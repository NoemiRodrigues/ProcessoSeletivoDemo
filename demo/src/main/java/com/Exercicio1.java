package com;
public class Exercicio1 {
    
    public Exercicio1 (){

    };

    int indice = 13;
    int SOMA = 0;
    int k = 0;

   public void ex1Result(){
    do {
        k++;
        SOMA = SOMA + k;
    } while (k < indice);
    System.out.println("O resultado do ex1 é: " + SOMA);
    }
   
}

// resultado será 91