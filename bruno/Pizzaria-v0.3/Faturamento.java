import java.util.ArrayList;

public class Faturamento {
    private double totalGeral = .0;
    private double totalEntregador = .0;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void addPedidos(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }

    public void setTotalGeral() {
        // this.totalGeral += valor;
        for (int i = 0; i < pedidos.size(); i++) {
            this.totalGeral += pedidos.get(i).getTotal();
        }
    }

    public void addTotalEntregador(double valor) {
        this.totalEntregador += valor;
    }

    public double getTotalLiquido() {
        return totalGeral - totalEntregador;
    }

    public void imprimirPedidos() {
        setTotalGeral();
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("---------Pedido Nº" + (i + 1) + "---------");
            pedidos.get(i).imprimirResumo();
            //System.out.println(pedidos.get(i).getTotal());
        }
        System.out.println(totalGeral);

    }

}
