package aula_online;

import java.util.Scanner;

public class exerc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        System.out.println("O maior integrante tem altura: " + maior);
        System.out.println("O menor integrante tem altura: " + menor);
    }

}