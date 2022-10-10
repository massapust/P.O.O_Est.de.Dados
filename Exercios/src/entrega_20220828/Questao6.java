package entrega_20220828;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
       try (Scanner entradaScanner = new Scanner(System.in)) {
         System.out.println("Digite o 1º numero da soma:");
          double a = entradaScanner.nextDouble();
          System.out.println("Digite o 2º numero da soma:");
          double b = entradaScanner.nextDouble();
          System.out.println("Digite o 3º numero da soma:");
          double c = entradaScanner.nextDouble();

          double m;

           m = ((a * 2) + (b * 3) + (c * 5)) / 10.0;
  
         System.out.println("A MEDIA é:" +m);
         System.out.printf("A MEDIA é: %.1f", +m);
      }
   }
}