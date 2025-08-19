import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] idades = new int[10]; 
            for (int i = 0; i < idades.length; i++) {
                System.out.print("Digite a idade " + (i+1) + ": ");
                idades[i] = entrada.nextInt();
            }
            System.out.println("\nIdades maiores que 18:");
            for (int i = 0; i < idades.length; i++) {
                if (idades[i] > 18) {
                    System.out.println(idades[i]);
                }
            }
        } 
    }
}
