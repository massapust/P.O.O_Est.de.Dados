package entrega_20220828;
import java.util.Scanner;
import java.util.Locale;;

public class Questao11 {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaScanner = new Scanner(System.in);
       
      System.out.println("Digite o raio da esfera:");
      double raio = entradaScanner.nextDouble();
     
      double PI = 3.14159;
      double volEsfera = (4/3.0) * PI * Math.pow(raio, 3);

      System.out.printf("VOLUME é: %.3f", volEsfera);

     }
}