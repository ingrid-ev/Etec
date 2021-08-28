/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;



/**
 *
 * @author ingrid
 */
public class calcJuros {
    public static void main(String[] args) {
      // Criação de variáveis
        double c, i, n, j;
       
       // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
      
      // Apresentação 
        System.out.println("\n\t\t\t --- Calculando Juros --- \n");
        
     // Entradas
        System.out.print("Digite o capital: ");
        c = entrada.nextDouble();
        System.out.print("Digite a taxa: ");
        i = entrada.nextDouble();
        System.out.print("Digite o perido de capitalização: ");
        n = entrada.nextDouble();
        
     // Processamento
        j = (i/100)* c * n;
        
     // Saída
        System.out.printf("\n\t\t(%f  / 100) * %f * %f = %f \n",i,c,n,j);
                
    }
    
}
