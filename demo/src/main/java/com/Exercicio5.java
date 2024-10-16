package com;
public class Exercicio5 {
    public Exercicio5(){

    }

public void ex5Result(){
    String palavraTeste = "processo";
    char[] palavrasModificador = palavraTeste.toCharArray();
    String resultado = "";
    

    int tamanhoPalavra = palavraTeste.length() - 1;
      while (tamanhoPalavra > -1) {
        char letra = palavrasModificador[tamanhoPalavra];
        resultado = resultado + letra;
        tamanhoPalavra --;
        
      }
      System.out.println("Resultados ex5: ");
      System.out.println(resultado);

}
    
}
