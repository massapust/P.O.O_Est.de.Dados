package entrega_20220828;

import java.util.Scanner;

public class Questao9 {
   public static void main(String[] args) {
      try (Scanner entradaScanner = new Scanner(System.in)) {
         System.out.println("Escreva o seu nome:");
         String nomefun = entradaScanner.next();

         System.out.println("Digite o salario fixo:");
         double salariofixo = entradaScanner.nextDouble();

         System.out.println("Digite o valor da venda realizada:");
         double vendasfeita = entradaScanner.nextDouble();

         double comissao = vendasfeita * 0.15;
         double salariofinal = salariofixo + comissao;

         System.out.println("Nome do Funcionario é:" + nomefun);
         System.out.printf("A salario com a comissão é:$ %.2f", salariofinal);
      }
   }
}