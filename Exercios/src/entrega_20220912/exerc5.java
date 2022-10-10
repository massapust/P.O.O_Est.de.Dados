        package entrega_20220912;
        import java.util.Scanner;

        /*
 * 5) Faça um algoritmo estruturado que leia uma quantidade
 * não determinada de números positivos.
 * Calcule a quantidade de números pares e ímpares,
 * a média de valores pares e a média geral dos
 * números lidos. O número que encerrará a leitura será zero.
 */

    public class exerc5 { 
   
        public static void main(String[] args) {           
            try (Scanner sc = new Scanner(System.in)) {
                int qtdI=0, qtdP=0, i, somaI = 0, somaP = 0, numeroI=0, numeroP=0;
                float mediaG, mediaP=0;
                               
                           
                do {
                    System.out.println("informe um numero: ");
                     i = sc.nextInt();
                     
                     if (i%2==0){ 
                         qtdP++;
                            somaP = numeroP + i;
                            numeroP = i;
                            
                            
                    } 
                     if (i%2==1){ 
                         qtdI++;
                            somaI = numeroI + i;
                            numeroI = i;
                            
                        
                    }
                     mediaP = (somaP / qtdP);
                     mediaG = (somaI + somaP) / (qtdI + qtdP);
                    
                    
                     System.out.println("media Pares: " + mediaP + " | Quantidade Par: " + qtdP + " | Quantidade Impar: " + qtdI );
                     System.out.println("media geral: " + mediaG );
                                     
                    } while (i != 0);
            }
    
        }
    
    }  
