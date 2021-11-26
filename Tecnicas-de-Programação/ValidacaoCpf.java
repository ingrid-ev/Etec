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
        public class ValidacaoCpf {
            public static void main(String[] args) {
              // variáveis
              int soma=0, idx=0, priD,segD;
              String cpf;

              // Objeto de entrada
                Scanner entrada = new Scanner(System.in);

                System.out.println("\n***** Validador de CPF *****\n");

              // Entrada
                System.out.print("Informe o CPF: ");
                cpf = entrada.next();

              //processamento
              if(cpf.length()== 11){
              // Varrer a string para acumular o produto do digito pelo seu proprio indice
                for(int i = 10; i >= 2;i--){
                    soma += Character.getNumericValue(cpf.charAt(idx))* i;
                    idx ++;
                }
              
              // Obter o resto inteiro da divisão por 11
                priD = soma % 11;

              // Verificando se o priD é maior ou igual a 2
                if(priD >= 2){
                    priD = 11 - priD;
                }
                else{
                priD = 0;
                }
                
              // Varrer o valor da string para acumular o produto do digito pelo seu índice
                soma = 0;
                idx = 0;
                for(int i = 11; i >= 2; i--){
                    soma += Character.getNumericValue(cpf.charAt(idx))* i;
                    idx ++;
                }

              // Achando o resto inteiro da divisão por 11
                segD = soma % 11;

              // Verificando se o resto da divisão é maior ou igual a 2
                if(segD >= 2){
                    segD = 11 - segD;
                }
                else{
                segD = 0;
                }
              // Resposta
                if(priD == Character.getNumericValue(cpf.charAt(9)) && segD == Character.getNumericValue(cpf.charAt(10))){

                  System.out.println("CPF válido!");
                  
                }else {
                    System.out.println("CPF inválido!");
                }
            }
            else{
                System.out.println("CPF: "+cpf+" tem a quantidade de dígitos incorreto!");
            }
                        
              
        }
    }
