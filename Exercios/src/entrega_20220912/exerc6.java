package entrega_20220912;

/*
 * 6) Escrever um
 * algoritmo que gera e escreve
 * os números ímpares entre 100 e 200.
 */

public class exerc6 {

    public static void main(String[] args) {

        int i, soma = 0;

        for (i = 100; i < 200; i++) {

            if (i % 2 == 1) {
                soma = i;
                System.out.printf("Soma dos numeros impares de 100 a 200: %d\n\n", soma);
            }

        }

    }

}