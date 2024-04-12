import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<ItemDoPedido>();
    private String cliente;
    private String bairro;
    private Double total = 0.0;


    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido.add(item);
        this.addTotal(item.getValor());
    }

    public ItemDoPedido getItemDoPedido(int index) {
        return this.itemDoPedido.get(index);
    }

    // METODO
    public void addTotal(Double valor) {
        this.total += valor;
        // PEGAR O TOTAL MAIS O VALOR DA PIZZA E SOMAR !
    }

    public Double getTotal() {
        return this.total;
    }

    public void setCliente(String nome) {
        this.cliente = nome;
    }

    public String getCliente() {
        return this.cliente;
    }

    public Double calcularFrete() {
        if (this.getBairro().equalsIgnoreCase("centro")) {
            return 10.00;
        } else if (this.getBairro().equalsIgnoreCase("periferia")) {
            return 15.00;
        } else {
            return 20.00;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void imprimir() {
        System.out.println("--------------------------------------------");
        System.out.println("                  PIZZARIA                  ");
        System.out.println("                 QuasePronto                ");
        System.out.println("--------------------------------------------");
        System.out.println(" Cliente     : " + this.cliente);
        System.out.println("--------------------------------------------");
        for (int i = 0; i < this.itemDoPedido.size(); i++) {
            if (i > 0) {
                System.out.println();
            }
            System.out.println(" Tipo        : " + this.getItemDoPedido(i).getTipo());
            System.out.println(" Sabor       : " + this.getItemDoPedido(i).getSabor());
            System.out.println(" Valor       : " + this.getItemDoPedido(i).getValor());
        }
        System.out.println("--------------------------------------------");
        System.out.println(" Tx. Entrega : " + this.calcularFrete());
        System.out.println("--------------------------------------------");
        System.out.println(" Total       : " + this.getTotal());
        System.out.println("--------------------------------------------");
    }

    public void imprimirResumo() {
        System.out.println("-------Faturamento -----");
        System.out.println(" Cliente     : " + this.cliente);
        for (int i = 0; i < this.itemDoPedido.size(); i++) {
            if (i > 0) {
                System.out.println();
            }
            System.out.println(" Tipo        : " + this.getItemDoPedido(i).getTipo());
            System.out.println(" Sabor       : " + this.getItemDoPedido(i).getSabor());
            System.out.println(" Valor       : " + this.getItemDoPedido(i).getValor());
        }
        System.out.println("--------------------------");
    }

    public void calculo(){
        // this.getItemDoPedido().getValor();
        // this.total();
        // this.calcularFrete();
    }
}