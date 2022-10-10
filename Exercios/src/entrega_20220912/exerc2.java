package entrega_20220912;
import java.util.Scanner;

/*
 2) Desenvolver um algoritmo que leia a altura de 15 pessoas.
 Este programa deverá calcular e
 mostrar :
 a. A menor altura do grupo;
 b. A maior altura do grupo;
 */

public class exerc2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Double maior = Double.MIN_VALUE;
            Double menor = Double.MAX_VALUE;

            for (int i = 0; i < 15; i++) {
                System.out.println("Digite sua altura: ");
                Double altura = sc.nextDouble();
                if (maior < altura) {
                    maior = altura;
                }
                if (menor > altura) {
                    menor = altura;
                }
            }

            System.out.println("O maior integrante do grupo tem altura: " + maior);
            System.out.println("O menor integrante do grupo tem altura: " + menor);
        }
    }
}