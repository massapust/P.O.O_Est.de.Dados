package entrega_20220828;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
       Scanner entradaScanner = new Scanner(System.in);
       System.out.println("Digite o seu numero de matricula:");
       int numerofunc = entradaScanner.nextInt();
       System.out.println("Digite quantidade de horas trabalhada:");
       int qtdHORAStrab = entradaScanner.nextInt();

       System.out.println("Digite o valor da hora:");
       double valorHORA = entradaScanner.nextDouble();
       
      double salario = qtdHORAStrab * valorHORA;

        
      System.out.println("A numero é:" +numerofunc);
      System.out.printf("A salario é:$ %.2f", +salario);
   }
}