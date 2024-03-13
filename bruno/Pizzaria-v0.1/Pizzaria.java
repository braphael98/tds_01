import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Pedido pedido = new Pedido();
       
        ItemDoPedido item = new ItemDoPedido();
        





        System.out.println("Bem vindo a pizzaria ");
        System.out.println(" ____                   \r\n" + //
                "/    \\\t\t\t\r\n" + //
                "  u  u|      _______    \r\n" + //
                "    \\ |  .-''#%&#&%#``-.   \r\n" + //
                "   = /  ((%&#&#&%&VK&%&))  \r\n" + //
                "    |    `-._#%&##&%_.-'   \r\n" + //
                " /\\/\\`--.   `-.\"\".-'\r\n" + //
                " |  |    \\   /`./          \r\n" + //
                " |\\/|  \\  `-'  /\r\n" + //
                " || |   \\     /       ");





        System.out.println("|--------------------|");
        System.out.println("Informe a categoria da pízza ? ");
        item.setTipo(sc.nextLine());
        
        System.out.println("Informe o Sabor da pizza: ");
        item.setSabor(sc.nextLine());

        System.out.println("Informe o valor da pizza: ");
        item.setValor(sc.nextDouble());

        pedido.adicionarItemDoPedido(item);

        System.out.println("Informe o nome do cliente: ");
        pedido.setCliente(sc.next());

        
        System.out.println("Taxa de entrega R$: ");
        pedido.setTxentrega(sc.nextDouble());


     



       
    }
}