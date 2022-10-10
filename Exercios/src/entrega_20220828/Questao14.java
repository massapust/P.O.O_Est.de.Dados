package entrega_20220828;
import java.util.Scanner;
import java.util.Locale;

public class Questao14 {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       try (Scanner entradaScanner = new Scanner(System.in)) {
         System.out.println("Digite a distancia percorrida:");
          int disP = entradaScanner.nextInt();
          

          System.out.println("Digite a quantidade de combustivel:");
          double qtdGAS = entradaScanner.nextDouble();
          
         double autoN = disP / qtdGAS;

           
         
         System.out.printf("A media de combustivel gasto: %.3f km/1%n", +autoN);
      }
   }
}