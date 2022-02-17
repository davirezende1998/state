public class Realizado implements Estado{
    private Realizado() {};
    private static Realizado instance = new Realizado();
    public static Realizado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido realizado";
    }

    public String realizar(Pedido pedido) {
        return "O pedido já foi realizado";
    }

    public String pagar(Pedido pedido) {
        pedido.setEstado(Pago.getInstance());
        return "Pagamento realizado";
    }

    public String entregar(Pedido pedido) {
        return "O pedido precisa ser pago antes de ir para a entrega";
    }

    public String receber(Pedido pedido) {
        return "O pedido ainda não foi pago.";
    }
}