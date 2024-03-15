import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id = 0;
    private double txEntrega = 0.0;
    private String cliente = "";
    private ItemDoPedido itemDoPedido;

    public void addItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido = item;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;

    }


    public void setTxEntrega(Double txEntrega) {
        this.txEntrega = txEntrega;
    }

    public double getTotal() {
        return this.txEntrega+this.itemDoPedido.getValor();
    }

   
    
    public void imprimir() {
        System.out.println("---------------------------------------");
        System.out.println("Nome: "+ this.cliente);
        System.out.println("---------------------------------------");
        System.out.println("Sabor Pizza: "+this.itemDoPedido.getSabor());
        System.out.println("Tipo: "+this.itemDoPedido.getTipo());
        System.out.println("----------------------------------------");
        System.out.println( "Valor R$:"+this.itemDoPedido.getValor());
        System.out.println("----------------------------------------");
        System.out.println("Tx Entrega R$:" + this.txEntrega);
        System.out.println("---------------------------------------");
        System.out.println("Total R$: "+this.getTotal());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}