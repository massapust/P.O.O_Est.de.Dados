package entrega_20220828;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
     Scanner enterScanner = new Scanner(System.in);
     int a;
     int b;
     System.out.println("Digite o primeiro numero da soma:");
     a = enterScanner .nextInt();
     System.out.println("Digite o segundo numero da soma:");
     b = enterScanner .nextInt();
     int s;
     s = a + b;

     System.out.println("O resultado da soma foi de: SOMA = " + s );
 }
}
