import java.util.ArrayList;


public class OrdemServico {
    private double total = .0;
    private Cliente cliente;

    private Veiculo veiculo;

    private ArrayList<Servico> servicos = new ArrayList<Servico>();

    public void addServico(Servico servico){
        this.servicos.add(servico);
    }

    public void addTotal(Double valor){
        this.total += valor;
    }
}
