import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        Usuario user1 = new Usuario();
        String continuar = "";

       // pedido.setListaProdutos(produto);


        System.out.println("Bem vindo a compras online.com");

        System.out.println("Digite seu usuario: ");
        user1.setNome(sc.nextLine());
        System.out.println("Digite sua senha: ");
        user1.setSenha(sc.nextLine());
        do {
            System.out.println("Digite os produtos para a compra: ");
            produto.setNome(sc.nextLine());
            System.out.println("Descreva o produto: ");
            produto.setDescricao(sc.nextLine());
            System.out.println("Digite o preço do produto R$: ");
            produto.setPreco(sc.nextDouble());
            sc.nextLine();
            System.out.println("Continuar?");
            continuar = sc.nextLine();
        } while (!continuar.equalsIgnoreCase(""));
        System.out.println("Digite seu engreço: ");
        pedido.setEndereco(sc.nextLine());
        System.out.println("Informações de pagamento (PIX | CREDITO | DEBITO ) ");
        pedido.setPagamento(sc.nextLine());

        pedido.imprimir(user1,produto);

    }
}