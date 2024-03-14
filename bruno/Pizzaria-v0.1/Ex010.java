
/*Funções: Refaça o seu programa anterior para incluir uma função que receba a
matriz como parâmetro e a exiba na tela. Em seguida, chame essa função no
programa principal. */
import java.util.Arrays;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[][] = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("digite um numero " + "[" + (x + 1) + ", " + (y + 1) + "]");
                numeros[x][y] = sc.nextInt();

            }
        }
        imprimir(numeros);
    }

    private static void imprimir(int[][] numeros) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
