import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("* Bem vindo a Pizza do luigi *");
        System.out.println("*************************");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        Pedido  pedido = new Pedido();

        String continuar;
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
    }
}