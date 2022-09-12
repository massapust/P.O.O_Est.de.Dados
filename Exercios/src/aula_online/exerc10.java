package aula_online;
import java.util.Scanner;

public class exerc10 { 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
    
    System.out.println("Digite o primeiro numero: ");
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

    