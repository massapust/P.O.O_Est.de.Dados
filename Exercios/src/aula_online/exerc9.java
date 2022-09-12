package aula_online;
import java.util.Scanner;

public class exerc9 {

	public static void main(String[] args) {
           
		Scanner sc = new Scanner(System.in);
           
		
		System.out.println("informe um valor inicial: ");
		int inicial = sc.nextInt();
		System.out.println("informe o quociente: ");
		int quociente = sc.nextInt();
		int gn = inicial, valor_max = 10;
        
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max );
        while(gn<=valor_max){
            System.out.println(gn);
            gn *= quociente;
        }
    }
}