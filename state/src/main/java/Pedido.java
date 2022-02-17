public class Pedido {
    private String descricao;
    private Estado estado;

    public Pedido() {
        this.estado = Realizado.getInstance();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String realizar() {
        return estado.realizar(this);
    }

    public String pagar() {
        return estado.pagar(this);
    }

    public String entregar() {
        return estado.entregar(this);
    }

    public String receber() {
        return estado.receber(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }
}