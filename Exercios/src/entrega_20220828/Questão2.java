package entrega_20220828;
import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        double r, n, area;
        n = 3.14159;
        System.out.println("Informe o raio:");
        r = enterScanner .nextInt();
        area = n * r * r;
   
        System.out.println("O valor da area é: A=" + area );
    }
   }