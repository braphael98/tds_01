/* Modifique o programa anterior para verificar se a soma dos números é maior que 10.
Se for, exiba "A soma é maior que 10"; caso contrário, exiba "A soma é menor ou
igual a 10". */
import java.util.Scanner;

public class Ex004 {
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
        if (soma >= 10) {
            System.out.println("A soma é maior que 10");
            System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        } else
            System.out.println("A soma é menor ou igual a 10");

    }
}
