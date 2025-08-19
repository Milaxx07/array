//2.Crie um programa com um vetor de 10 elementos inteiros. Exibir em tela os valores pares
import java.util.Scanner;

public class Numeros{
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[10];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i+1) + ": ");
                numeros[i] = entrada.nextInt();
            }
            
            System.out.println("\nNúmeros pares digitados: ");
            for (int i = 0; i < numeros.length; i++){
                if (numeros[i] % 2 == 0){
                    System.out.println(numeros[i]);
                }
            }
        }

    }
}

