package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class App12 {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaScanner = new Scanner(System.in);
      
      double PI = 3.14159;
       
      System.out.println("Digite a variavel A:");
      double A = entradaScanner.nextDouble();
      System.out.println("Digite a variavel B:");
      double B = entradaScanner.nextDouble();
      System.out.println("Digite a variavel C:");
      double C = entradaScanner.nextDouble();

      double areaTriaguloR = (A*C) / 2.0;
      double areaCR = PI * Math.pow(C, 2);
      double areaTrapezio = ((A+B) * C) / 2.0;
      double areaQuadrado = B * B;
      double areaRetangulo = A * B;

      System.out.printf(" |TRIANGULO = %.3f", areaTriaguloR );
      System.out.printf(" |CIRCULO = %.3f", areaCR );
      System.out.printf(" |TRAPEZIO = %.3f", areaTrapezio );
      System.out.printf(" |QUADRADO = %.3f", areaQuadrado ) ;
      System.out.printf(" |RETANGULO = %.3f", areaRetangulo );

     }
}