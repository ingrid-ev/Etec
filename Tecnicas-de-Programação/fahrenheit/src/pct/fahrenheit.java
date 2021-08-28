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
public class fahrenheit {
    public static void main(String[] args) {
        // Declaração de variáveis
        float cel, fah;
        
        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Converção de Celsius para fahrenheit -- \n");
        
        //Entradas
        System.out.print("Digite o grau celsius: ");
        cel = entrada.nextFloat();
        
        // Processamento
        fah = 9 * cel / 5 + 32;
       
        
        //Saída
        System.out.printf("\n\t 9 * %f / 5 + 32 = %f \n", cel, fah);
        
    }
    
}
