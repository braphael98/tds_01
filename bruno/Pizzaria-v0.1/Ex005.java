/* Estruturas de Repetição: Escreva um programa que solicite ao usuário um número
inteiro positivo e, em seguida, exiba todos os números de 1 até o número inserido
pelo usuário.*/
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        System.out.println("Numeros abaixo: ");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
