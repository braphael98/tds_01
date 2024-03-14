
/*Escreva uma função que receba um vetor de inteiros como parâmetro e retorne o
maior elemento do vetor. Em seguida, utilize essa função para encontrar e exibir o
maior elemento do vetor inserido pelo usuário. */
import java.util.Arrays;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
          
        }
        System.out.println("O maior numero é "+maiorNumero(numeros));

    }
//função para encontrar o maior numero
    private static int maiorNumero(int[] numeros) {
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
