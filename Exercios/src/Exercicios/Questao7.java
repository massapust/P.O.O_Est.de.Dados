package Exercicios;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
       Scanner entradaScanner = new Scanner(System.in);
       System.out.println("Digite o 1º numero da operação:");
       int a = entradaScanner.nextInt();
       System.out.println("Digite o 2º numero da operação:");
       int b = entradaScanner.nextInt();
       System.out.println("Digite o 3º numero da operação:");
       int c = entradaScanner.nextInt();
       System.out.println("Digite o 4º numero da operação:");
       int d = entradaScanner.nextInt();

       int dif;

        dif = (a * b - c * d);
   
      System.out.println("A diferença é:" +dif);    
   }
}