/*Modifique o programa anterior para permitir que o usuário insira os nomes em uma
matriz 2x3. Após inserir os nomes, exiba a matriz na tela.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[][] = new int[2][3];
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("digite um numero " + "[" + (x + 1) + ", " + (y + 1) + "]");
                numeros[x][y] = sc.nextInt();

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
