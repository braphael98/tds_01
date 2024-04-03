import java.time.LocalDateTime;
public class Servico {
    private Double valor;
    private LocalDateTime data = LocalDateTime.now();
    private String descricao;

    public Double getValor() {
        return valor;
    }

    public void addValor(Double valor) {
        this.valor += valor;
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
