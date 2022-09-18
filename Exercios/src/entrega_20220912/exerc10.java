package entrega_20220912;
import java.util.Scanner;
/*
 * 10) Escreva um algoritmo que leia um valor inicial A e
 * imprima a seqüência de valores do cálculo de
 * A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
 */

public class exerc10 { 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
    
    System.out.println("Digite um número para fatorar: ");
        numero = sc.nextInt();
        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
        fatorial = fatorial * i;
        i++;           
        }
        
        System.out.println(" O Fatorial de " + numero + " é " + fatorial);
}


}

    