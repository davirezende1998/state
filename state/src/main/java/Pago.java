public class Pago implements Estado{
    private Pago() {};
    private static Pago instance = new Pago();
    public static Pago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido pago";
    }

    public String realizar(Pedido pedido) {
        return "O pedido já foi realizado e pago";
    }

    public String pagar(Pedido pedido) {
        return "O pedido já foi pago";
    }

    public String entregar(Pedido pedido) {
        pedido.setEstado(EmEntrega.getInstance());
        return "O pedido saiu para entrega";
    }

    public String receber(Pedido pedido) {
        return "O pedido ainda não saiu para entrega";
    }
}