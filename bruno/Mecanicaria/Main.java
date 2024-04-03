import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        Servico servico = new Servico();
        OrdemServico OrdServico = new OrdemServico();




        System.out.print("Digite o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("---Informe os Dados do cliente---");
        System.out.print("Digite o CPF: ");
        cliente.setCpf(sc.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(sc.nextLine());
        System.out.print("Telfone: ");
        cliente.setContato(sc.nextLine());
        System.out.println("Informe o modelo, cor, e fabricante do veiculo");
        veiculo.setDescricao(sc.nextLine());
        System.out.print("Informe o ano do veiculo: ");
        veiculo.setAno(sc.nextInt());
        System.out.println("Informe a placa do veiculo: ");
        veiculo.setPlaca(sc.nextLine());



    }
}