package Exercicios;
import java.util.Scanner;


public class Questao15 {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
      
          
      System.out.println("Digite a variavel x1:");
      double x1 = entradaScanner.nextDouble();
      System.out.println("Digite a variavel y1:");
      double y1 = entradaScanner.nextDouble();
      System.out.println("Digite a variavel x2:");
      double x2 = entradaScanner.nextDouble();
      System.out.println("Digite a variavel y2:");
      double y2 = entradaScanner.nextDouble();

      double distnciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
     
      System.out.printf(" Distacia entre 2 pontos = %.4f%n", distnciaXY );
      

     }
}