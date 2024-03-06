import java.util.Scanner;

public class Calculadora {
    public static void soma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int num1 = sc.nextInt();
        System.out.print("B: ");
        int num2 = sc.nextInt();
        System.out.print("Resultado: "+(num1 + num2));

    }

    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int num1 = sc.nextInt();
        System.out.println("B: ");
        int num2 = sc.nextInt();
        System.out.print("Resultado: "+(num1 - num2));

    }

    public static void mult() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int num1 = sc.nextInt();
        System.out.print("B: ");
        int num2 = sc.nextInt();
        System.out.print("Resultado: "+(num1 * num2));
        System.out.println("------------");

    }

    public static void div() {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int num1 = sc.nextInt();
        System.out.println(" / ");
        System.out.print("B: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println(" NÃO PODE DIVIDIR, DIGITE O NOME");
            div();
        } else {
            System.out.println("Resultado: "+(num1 / num2));
        }

    }

    public static void main(String[] args) {
        System.out.println("Calculadora");
        String menu = """
            |---------------------------------------|
                Para calcular digite:
                'soma' - para somar
                'sub' - para subtração
                'mult' - para multiplicação
                'div' - para divisao
                'sair' - para finalizar a operação!
            |---------------------------------------|
                """;
                System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        while (!entrada.equals("sair")) {
            
            switch (entrada) {
                
                case "soma":
                    soma();
                    break;
                case "sub":
                    sub();
                    break;
                case "mult":
                    mult();
                    break;
                case "div":
                    div();
                    break;

                default:
                    System.out.println("Operação invalidada");
                    break;
            }
             entrada = sc.nextLine();
        }

    }
}
