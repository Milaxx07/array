//1.Crie um programa que armazene as notas de 10 alunos recebidas pelo usuário. O programa deve retornar a maior nota em tela
import java.util.Locale;
import java.util.Scanner;

public class MaiorNota{
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)) {
            double[] notas = new double[10];
            double maiorNota = 0;

            for (int i = 0; i < notas.length; i++){
                System.out.print("Digite a nota do aluno " +  (i+1) + ": " );
                notas[i] = entrada.nextDouble();

                if (notas[i] < 0 || notas[i] > 10){
                    System.out.println("Digite a nota correta");
                    i--;
                    continue;
                }
                
                if (i == 0 || notas[i] > maiorNota){
                    maiorNota = notas[i];
                }
            }

            System.out.println("\nA maior nota foi: " + maiorNota);
        }
    }
}


