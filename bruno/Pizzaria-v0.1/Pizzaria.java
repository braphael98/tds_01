import java.util.Scanner;

public class Pizzaria{
    public static void main(String[] args) {
        System.out.println("Seja bem-viado a pizza da boa");

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        System.out.print("Informe o tipo da pizza:");
        item.setTipo(scan.nextLine());

        System.out.print("Informe o sabor da pizza: ");
        item.setSabor(scan.nextLine());

        System.out.print("Informe o valor da pizza: ");
        item.setValor(scan.nextDouble());

        pedido.addItemDoPedido(item);

        System.out.print("Informe o nome do cliente: ");
        scan.nextLine();
        pedido.setCliente(scan.nextLine());

        System.out.print("Informe a taxa da entrega:");
        pedido.setTxEntrega(scan.nextDouble());

        pedido.imprimir();
    }
}