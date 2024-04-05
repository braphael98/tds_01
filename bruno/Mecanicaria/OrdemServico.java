import java.util.ArrayList;
import java.util.Arrays;


public class OrdemServico {
    private double total = .0;
    private Cliente cliente;
    private Veiculo veiculo;
    private ArrayList<Servico> servicos = new ArrayList<Servico>();
    public void addServico(Servico servico){
        this.servicos.add(servico);
    }
    public String getServicos() {
        String formatada = "";

        for (int i = 0; i < servicos.size(); i++) {
            formatada += servicos.get(i).getDescricao()+" ";
        }
        return formatada;
    }
    public void addTotal(Double valor){
        this.total += valor;
    }
    public double getTotal() {
        double total = .0;
        for (int i = 0; i < servicos.size(); i++) {
            total+=servicos.get(i).getValor();
        }
        return total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
    public void imprimir(){
        System.out.println("Veiculo: "+ getVeiculo().getDescricao());
        System.out.println("Ano: " +getVeiculo().getAno());
        System.out.println("Cliente: "+getCliente().getNome());
        System.out.println("Serviço: "+getServicos());
        System.out.println("Total: "+getTotal());
    }
}
