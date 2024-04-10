import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        String operador = "";
        while (true) {
            
            System.out.println("Digite um numero: ");
            n1 = sc.nextDouble();
            if(n1 == 0){
                System.out.println("Encerrado !");
                break;
            }
            sc.nextLine();
            System.out.println("Digite uma operação: ");
            operador = sc.nextLine();
            System.out.println("Digite outro numero: ");
            n2 = sc.nextDouble();
            sc.nextLine();

            switch (operador) {
                case "+":
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (n1 * n2));
                    break;

                case "/":
                    if(n2 == 0){
                        System.out.println("Nao pode dividir por 0");
                        break;
                    }
                    System.out.println("Resultado: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Operador invalido , burro !");
                    break;
            }
        }
       sc.close();
    }

}