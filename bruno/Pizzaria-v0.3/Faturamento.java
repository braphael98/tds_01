package Pizzaria-v0.3;

public class Faturamento {
    private double totalGeral = .0;
    private double totalEntregador = .0;
    
    public void addTotalGeral(double valor){
        this.totalGeral += valor;
    }
    public void addTotalEntregador(double valor){
        this.totalEntregador += valor;
    }
    public double getTotalLiquido(){
        return totalGeral - totalEntregador;
    }

    
    
    
}
