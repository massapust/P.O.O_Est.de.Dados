package Exercicios;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
       Scanner entradaScanner = new Scanner(System.in);
       
       System.out.println("Digite o codigo da 1º peça:");
       int codpeca1 = entradaScanner.nextInt();

       System.out.println("Digite a quantidade da 1º peça:");
       int qtdpeca1 = entradaScanner.nextInt();

       System.out.println("Digite o valor da 1º peça:");
       double valorpeca1 = entradaScanner.nextDouble();

       System.out.println("Digite o 2º codigo da peça:");
       int codpeca2 = entradaScanner.nextInt();

       System.out.println("Digite a quantidade da 2º peça:");
       int qtdpeca2 = entradaScanner.nextInt();

       System.out.println("Digite o valor da 2º peça:");
       double valorpeca2 = entradaScanner.nextDouble();
       
      double custototal = qtdpeca1 * valorpeca1 + qtdpeca2 * valorpeca2;
          
      System.out.println("Cod do produto é:" +codpeca1);
      System.out.println("Valor do Produto é R$:" +valorpeca1);
      System.out.println("Qtd:" +qtdpeca1);
      System.out.println("Cod do produto é:" +codpeca2);
      System.out.println("Valor do Produto é R$:" +valorpeca2);
      System.out.println("Qtd:" +qtdpeca2);
      
      System.out.printf("O valor total do orçamento é:$ %.2f", custototal);
   }
}