package pratica_20220915;
import java.util.Scanner;

/**
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou
 * não um triângulo. Em caso positivo,
 * calcule o perímetro do triângulo e apresente a mensagem:
 * Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio
 * que tem A e B como base e C como altura, mostrando a mensagem
 * Area = XX.X
 * Entrada
 * A entrada contém três valores reais.
 * Saída
 * O resultado deve ser apresentado com uma casa decimal.
 * <p>
 * | b - c | < a < b + c
 * | a - c | < b < a + c
 * | a - b | < c < a + b
 */

public class exerc1 {

    public static Boolean c1T(Double x, Double y, Double z) {
        return Math.abs(x - y) < z;
    }

    public static Boolean c2T(Double x, Double y, Double z) {
        return x < y + z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        if (c1T(b, c, a) && c2T(a, b, c) &&
                c1T(a, c, b) && c2T(b, a, c) &&
                c1T(a, b, c) && c2T(c, a, b)) {
            System.out.println(" perimetro =" + (a + b + c));
        } else {
            System.out.println("a area e = " + (((a + b) * c) / 2));
        }
    }
}
