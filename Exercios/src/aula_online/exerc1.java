package aula_online;

public class exerc1 {

    public static void main(String[] args) {
       
            int i, soma = 0;

            for(i = 0; i < 500; i++){
                
                if (i%2==1 && i%3==0){ 
                    soma = soma + i;
                }
                       
            }
        
            System.out.printf("Soma dos numeros impares multipos de 3 de 1 a 500: %d\n\n", soma);
        }

    }
