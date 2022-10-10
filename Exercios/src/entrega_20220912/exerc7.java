package entrega_20220912;

/*
 * 7) Escrever um algoritmo que leia um valor para uma variável N de 1 a 10
 * e calcule a tabuada de
 * N. Mostre a tabuada na forma:
 * 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
 */

import java.util.Scanner;

public class exerc7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer A =  null;
            while (A == null || A < 0 || A > 10){
                System.out.println("Digite o multipicador : ");
                A = scanner.nextInt() ;
            }
                int i, multi = 0;

                for(i = 0; i < 11; i++){
                    
                        multi = A * i;
                        System.out.println("    "+A +" X " +i +" = " +multi);
                        System.out.print(i + " x " + A + " = " + (A*i) + ", ");
                    
                    
            
                }
        }
        
         }
    }