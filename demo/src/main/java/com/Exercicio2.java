package com;
import java.util.Scanner;

public class Exercicio2 {

    int primeiroValor = 0;
    int segundoValor = 1;
    int result;

    public void ex2Result(){

    Scanner scanner = new Scanner(System.in) ;
    System.out.println("Digite o número para o ex2: ") ;
    
    int valorDoUsuário = scanner.nextInt() ;
    scanner.close() ;

    do {
        result = primeiroValor + segundoValor;
        primeiroValor = segundoValor;
        segundoValor = result;
    } while (result > valorDoUsuário);

    if (primeiroValor == valorDoUsuário){
        System.out.println("O valor não pertence a sequência de fibonnaci");
    } else {
        System.out.println("O valor pertence a sequência de fibonnaci");
    }
    }
}
