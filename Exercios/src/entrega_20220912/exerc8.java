package entrega_20220912;
import java.util.Scanner;

/*
 * 8) Escreva um algoritmo que leia um valor inicial A e uma razão
 * R e imprima uma seqüência em
 * P.A. contendo 10 valores.
 */

public class exerc8 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
	System.out.println("Digite o A : ");
    double a=sc.nextDouble();
	System.out.println("Digite o Razão : ");
    double r=sc.nextDouble();
    double result= a;

        for (int i = 0; i <10 ; i++) {
         System.out.println(result);
         result += r;
        }
    }
}