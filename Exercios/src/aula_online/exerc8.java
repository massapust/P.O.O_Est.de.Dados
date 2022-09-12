package aula_online;
import java.util.Scanner;

public class exerc8 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
           
		
		System.out.println("informe um valor inicial: ");
		int inicial = sc.nextInt();
		System.out.println("informe a razao: ");
		int razao = sc.nextInt();
		int an = inicial, valor_max = 10;
        
        
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, valor_max );
        while(an<=valor_max){
            System.out.println(an);
            an += razao;
        }
    }
}