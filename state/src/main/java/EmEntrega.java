public class EmEntrega implements Estado{
    private EmEntrega() {};
    private static EmEntrega instance = new EmEntrega();
    public static EmEntrega getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido em rota de entrega";
    }

    public String realizar(Pedido pedido) {
        return "O pedido já está em rota de entrega";
    }

    public String pagar(Pedido pedido) {
        return "O pedido já está em rota de entrega";
    }

    public String entregar(Pedido pedido) {
        return "O pedido já está em rota de entrega";
    }

    public String receber(Pedido pedido) {
        pedido.setEstado(Recebido.getInstance());
        return "O pedido está quase chegando";
    }
}