package Exercicios;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
     Scanner enterScanner = new Scanner(System.in);
     int a;
     int b;
     System.out.println("Digite o 1º numero da operação:");
     a = enterScanner .nextInt();
     System.out.println("Digite o 2º numero da operação:");
     b = enterScanner .nextInt();
     int p;
     p = a * b;

     System.out.println("O resultado da soma foi de: PROD = " + p );
 }
}