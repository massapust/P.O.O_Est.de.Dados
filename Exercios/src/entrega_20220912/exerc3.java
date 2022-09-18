package entrega_20220912;

import java.util.Scanner;

/*
 * 3) Desenvolver um algoritmo que leia um número não
 * determinado de valores e calcule e escreva a
 * média aritmética dos valores lidos, a quantidade de
 * valores positivos, a quantidade de valores
 * negativos e o percentual de valores negativos e positivos.
 */

public class exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String exit;
		double numero=0 , qtdP = 0 , qtdN = 0 ,  soma = 0;
		double mediaAr = 0 , percentP = 0, percentN = 0;
		
		
		do {
			System.out.println("Digite um numero: ");
		     numero = sc.nextDouble();
			
			if (numero >= 0) {   //positivo
				qtdP++;
					
			} 
			if (numero < 0) {   //negativo
				qtdN++;
								
			}
			System.out.println("Você encerrar o programa? se sim (S) se nao (N)");
            exit = sc.next();			
			} while (!exit.toUpperCase().equals("S"));

			numero += numero;
			mediaAr = numero / (qtdN+ qtdP);
			percentN = (qtdN * 100) / (qtdP + qtdN);
			percentP = (qtdP * 100) / (qtdP + qtdN);
			
			 System.out.println(" A media aritimetica é :" + mediaAr);
	         System.out.println("A quantidade de números Positivos: " + qtdP + " | Percentual Positivo: " + percentP + "%");
	         System.out.println("A quantidade de números negativos: " + qtdN + " | Percentual Negativo: " + percentN + "%");		
	}

}
