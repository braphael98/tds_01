import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("* Bem vindo a Pizza do luigi *");
        System.out.println("*************************");
        ;
        String menu = ("\n----------------------------\nDigite a operação desejada\n 1-Pedido\n 2- Imprimir\n #-sair.\n----------------------------");
        String operador = "";
        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        String continuar;

        while (true) {
            System.out.println(menu);
            System.out.print("Digite aqui: ");
            operador = scan.nextLine();
            if(operador.equals("#")){
                System.out.println("Programa Encerrado !");
                break;
            }
            switch (operador) {
                case "1":
                    do {

                        ItemDoPedido item = new ItemDoPedido();

                        System.out.print("Informe o tipo de pizza: ");
                        item.setTipo(scan.nextLine().trim());

                        System.out.print("Informe o sabor da pizza: ");
                        item.setSabor(scan.nextLine().trim());

                        pedido.adicionarItemDoPedido(item);

                        System.out.print("mais alguma coisa? ");
                        continuar = scan.nextLine();
                    } while (!continuar.equalsIgnoreCase(""));

                    System.out.print("Nome do cliente: ");
                    pedido.setCliente(scan.nextLine().trim());

                    System.out.print("Informe o bairro: ");
                    pedido.setBairro(scan.nextLine());

                    pedido.imprimir();

                    break;

                default:
                System.out.println("Digite uma opção Valida !");
                    break;
            }
        }

    }
}