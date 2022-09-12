package aula_online;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {

		
		int numero=0 , qtdP = 0 , qtdN = 0 ,  somaP , somaN, numeroP = 0 , numeroN = 0 ;
		double mediaP = 0 , mediaN = 0 , percentP, percentN ;
		Scanner S = new Scanner(System.in);
		
		do {
			System.out.println("informe um numero: ");
		     numero = S.nextInt();
			
			if (numero >= 0) {   //positivo
				qtdP ++;
				somaP = numero + numeroP;
				mediaP = somaP / qtdP;
				numeroP = numero;
			} 
			if (numero < 0) {   //negativo
				qtdN ++;
				somaN = numero + numeroN;
				mediaN = somaN / qtdN;
				numeroN = numero;
				
			}
			
			percentP = (qtdP * 100) / (qtdP + qtdN);
			percentN = (qtdN * 100) / (qtdP + qtdN);
			
	         System.out.println("Media Positiva: " + mediaP + " | Percentua Positiva: " + percentP);
	         System.out.println("Media Negativa: " + mediaN + " | Percentua Negativo: " + percentN);
			
			} while (numero != 0);
		
		
		
		
		
		
		
		
	}
	

}

