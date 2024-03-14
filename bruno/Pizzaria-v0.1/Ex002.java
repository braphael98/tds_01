/*Escreva um programa que solicite ao usuário que insira dois números inteiros e
realize a soma desses números. Em seguida, exiba o resultado da soma*/

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");

        num2 = sc.nextInt();
        soma = num1 + num2;

        System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
    }
}
