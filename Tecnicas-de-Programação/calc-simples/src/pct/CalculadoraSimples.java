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
public class CalculadoraSimples {
    public static void main(String[] args) {
        //declaração de variáveis
        int n1, n2, totals, totald, totalm;
        // criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        // Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        
        // Entradas
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();
        
        
        //Processamento
        totals = n1 + n2;
        totald = n1 / n2;
        totalm = n1 * n2;
        
        
        
        //Saída
        System.out.printf("\n\t%d + %d = %d\n", n1, n2, totals);
        System.out.printf("\n\t%d / %d = %d\n", n1, n2, totald);
        System.out.printf("\n\t%d * %d = %d\n", n1, n2, totalm);
        
    }
}
