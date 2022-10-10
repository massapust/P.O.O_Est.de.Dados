package pratica_20220915;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario >= 0.0 && salario <= 2000.0){
            System.out.print(0);
        }else if (salario >= 2000.01  && salario<= 3000.0){
           System.out.print(salario * 0.08);
        }else if (salario >= 3000.01  && salario<= 4500.0){
            System.out.print(salario * 0.18);
        }else if (salario > 4500.0){
            System.out.print(salario * 0.28);

        }



    }
}