import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {
    private LocalDateTime data = LocalDateTime.now();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private double frete;
    private String endereco;
    private String pagamento;
  //  private Produto listaProdutos;

   // private ArrayList<String> lista = new ArrayList<>();

  //  public void setListaProdutos(Produto listaProdutos) {
     //   this.listaProdutos = listaProdutos;
   // }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


   // public void setLista(ArrayList<String> lista) {
       // listaProdutos.add(listaProdutos.getNome());
    //}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void imprimir(Usuario user, Produto compra) {
        System.out.println("----------------------------------------");
        System.out.println("Nome do produto:\t" + compra.getNome());
        System.out.println("Preço do produto R$:\t" + compra.getPreco());
        System.out.println("Endereço para entrega:\t" + getEndereco());
        System.out.println("Nome do cliente:\t" + user.getNome());
        System.out.println("Informação do pagamento: \t" + getPagamento());
        System.out.println("Data da compra:\t" + data.format(formatoData));
        System.out.println("----------------------------------------");

    }


}
