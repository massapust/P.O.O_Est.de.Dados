package entrega_20220828;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
       try (Scanner entradaScanner = new Scanner(System.in)) {
         System.out.println("Digite o numero A:");
          int A = entradaScanner.nextInt();
          System.out.println("Digite o numero B:");
          int B = entradaScanner.nextInt();
          System.out.println("Digite o numero C:");
          int C = entradaScanner.nextInt();
             
          int maiorAB = (A + B + Math.abs(A -B)) / 2;
          int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

          System.out.println(maiorABC + " é o maior");
      }    
   }
}