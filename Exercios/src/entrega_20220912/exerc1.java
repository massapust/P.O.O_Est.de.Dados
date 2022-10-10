package entrega_20220912;

/*
1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
três e que se encontram no conjunto dos números de 1 até 500.
 */

public class exerc1 {

    public static void main(String[] args) {

        int i, soma = 0;

        for (i = 0; i < 500; i++) {

            if (i % 2 != 1 && i % 3 == 0) {
                soma += i;
            }

        }

        System.out.printf("Soma dos numeros impares multipos de 3 de 1 a 500: %d\n\n", soma);
    }

}
