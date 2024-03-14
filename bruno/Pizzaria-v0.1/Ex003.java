
/* Estruturas Condicionais: Modifique o programa anterior para verificar se a idade é
maior ou igual a 18 anos. Se for, exiba "Você é maior de idade"; caso contrário, exiba
"Você é menor de idade".*/
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("-----------MAIOR DE IDADE--------");
            System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos");
        } else
            System.out.println(nome + " é de menor");

    }
}
