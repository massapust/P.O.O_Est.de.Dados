package aula_online;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
		int i , contA = 0 , contB = 0 , contC = 0 , contD = 0;
		
		Scanner S = new Scanner(System.in);
		
		
		    do {
           System.out.println("Digite um numero:(X) ou um numero negativo para SAIR.");
		     i = S.nextInt();
		     
		     
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
					
	           } while (i >= 0);
		    
		    
System.out.println(" Quantidade da chave [0 - 25]=  " + contA);
System.out.println(" Quantidade da chave [26 - 50]=  " + contB);
System.out.println(" Quantidade da chave [51 - 75]=  " + contC);
System.out.println(" Quantidade da chave [76 - 100]=  " + contD);
}
}
