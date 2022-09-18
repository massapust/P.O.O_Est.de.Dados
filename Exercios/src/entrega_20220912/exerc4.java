package entrega_20220912;
import java.util.Scanner;

/*
 * 4) Escrever um algoritmo que leia
 * uma quantidade desconhecida de números e conte quantos deles
 * estão nos seguintes intervalos: [0-25],
 * [26-50], [51-75] e [76-100]. A entrada de dados deve
 * terminar quando for lido um número negativo.
 */

public class exerc4 {
    public static void main(String[] args) {
		int i , contA = 0 , contB = 0 , contC = 0 , contD = 0, ContMaior =0;
		String exit;
		Scanner sc = new Scanner(System.in);
		
		
		    do {
           System.out.println("Digite um numero:(X) ");
		     i = sc.nextInt();
		     
		    if (i < 0 && i > 100){
			 System.out.println("É importante o número estar entre 0 e 100!");
			 ContMaior++;
			}
			if (i >= 0 && i <= 25) {
				contA++;
			}
			if (i >= 26 && i <= 50) {
				contB++;
			}
			if (i >= 51 && i <= 75) {
				contC++;
			}
			if (i >= 76 && i <= 100) {
				contD++;
			} 
				
	        System.out.println("Você encerrar o programa? se sim (S) se nao (N)");
            exit = sc.next();			
			} while (!exit.toUpperCase().equals("S"));
		    
		    
System.out.println(" Quantidade da chave [0 - 25]=  " + contA);
System.out.println(" Quantidade da chave [26 - 50]=  " + contB);
System.out.println(" Quantidade da chave [51 - 75]=  " + contC);
System.out.println(" Quantidade da chave [76 - 100]=  " + contD);
System.out.println(" Quantidade fora das chaves =  " + ContMaior);
}
}
