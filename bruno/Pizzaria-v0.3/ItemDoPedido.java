public class ItemDoPedido {
    private String tipo;
    private String sabor;
    private Double valor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }


    public Double getValor() {
        if(this.getTipo().equalsIgnoreCase("Tradicional")){
            return 40.0;
        }else return 50.0;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return this.sabor;
    }
}