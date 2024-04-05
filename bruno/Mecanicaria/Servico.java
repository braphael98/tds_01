import java.time.LocalDateTime;
public class Servico {
    private Double valor = .0;
    private LocalDateTime data = LocalDateTime.now();
    private String descricao;


    public void addValor(Double valor) {
        this.valor += valor;
        System.out.println("funciono");
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
