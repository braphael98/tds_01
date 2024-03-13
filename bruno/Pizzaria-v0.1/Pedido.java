import java.util.List;
import java.util.ArrayList;
public class Pedido {

    private double id;

    private double txEntrega;

    private  List <ItemDoPedido> itensDoPedido = new ArrayList();

    private String cliente;

    public void adicionarItemDoPedido(ItemDoPedido item){
        this.itensDoPedido.add(item);
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setTxentrega(Double txEntrega){
        this.txEntrega = txEntrega;
    }
    public double getTotal(){
        
    }
    public void imprimir(){
        System.out.println("");
        System.out.println("Cliente:"+ this.cliente);
        System.out.println("Total: ");
       
    }
}