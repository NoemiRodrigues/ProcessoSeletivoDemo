package com;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Exercicio3 {

public Exercicio3(){

};

public void ex3Result(){
    double menorFaturamento = 0;
    double maiorFaturamento = 0;
    double médiaFaturamento = 0;
    double soma = 0;
    double diasAcimaDaMédia = 0;
    double diasTotaisSemConsiderar0 = 0;
 
    ObjectMapper objectMapper = new ObjectMapper();

    try{

    Dia[] mes = objectMapper.readValue(new File("demo\\src\\main\\resources\\dados.json"), Dia[].class);

    for (Dia dia : mes){

    
        if (dia.getValor() > 0) {    //Aqui calculamos a média total
            soma = soma + dia.getValor(); 
            diasTotaisSemConsiderar0++;           
        }
                               
        if(dia.getValor() < menorFaturamento) {  //Aqui calculamos o menor valor
        menorFaturamento = dia.getValor();  
        }                                    
        
        if (dia.getValor() > maiorFaturamento) {  //Aqui calculamos o menor valor
            maiorFaturamento = dia.getValor();
        }
        

    }
        médiaFaturamento = soma / diasTotaisSemConsiderar0;

        for (Dia dia : mes){
            if (dia.getValor() > médiaFaturamento){
                diasAcimaDaMédia++;
            }
        }
        System.out.println("Resultados ex3: ");
        System.out.println("Menor faturamento: R$ " + menorFaturamento);
        System.out.println("Maior faturamento: R$ " + maiorFaturamento);
        System.out.println("Dias acima da média: " + diasAcimaDaMédia);

        System.out.println(médiaFaturamento);
    
    } catch (Exception e) {
    throw new RuntimeException(e);
}
}



}
