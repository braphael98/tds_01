/*Vetores: Crie um programa que solicite ao usuário que insira 5 números inteiros e
armazene-os em um vetor. Em seguida, exiba os números na ordem inversa em que
foram digitados. */
import java.util.Arrays;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero "+(i+1)+": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Seus numeros: "+ Arrays.toString(numeros));

    }
}
    