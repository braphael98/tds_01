/*Entrada e Saída de Dados: Escreva um programa Java que solicite ao usuário seu
nome e idade e, em seguida, exiba essas informações na tela.*/

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos");
    }
}