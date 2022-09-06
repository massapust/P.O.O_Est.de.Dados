package Exercicios;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
       Scanner entradaScanner = new Scanner(System.in);
       System.out.println("Digite o 1º numero da soma:");
       double a = entradaScanner.nextDouble();
       System.out.println("Digite o 2º numero da soma:");
       double b = entradaScanner.nextDouble();
       double m;

        m = ((a*3.5) + (b* 7.5))/ 11.0;
   
      System.out.println("A MEDIA é:" +m);
      System.out.printf("A MEDIA é: %.5f", +m);
   }
}