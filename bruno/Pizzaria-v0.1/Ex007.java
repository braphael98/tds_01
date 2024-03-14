/*Crie um programa que solicite ao usuário que insira 5 nomes e armazene-os em um
vetor. Em seguida, exiba os nomes em ordem alfabética. */
import java.util.Arrays;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

        }
        Arrays.sort(nomes);
        System.out.print("O nomes em ordem alfabética são "+Arrays.toString(nomes));
        
        }

    }
