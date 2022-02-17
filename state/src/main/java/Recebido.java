public class Recebido implements Estado{
    private Recebido() {};
    private static Recebido instance = new Recebido();
    public static Recebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido recebido";
    }

    public String realizar(Pedido pedido) {
        return "O pedido já foi recebido";
    }

    public String pagar(Pedido pedido) {
        return "O pedido já foi recebido";
    }

    public String entregar(Pedido pedido) {
        return "O pedido já foi recebido";
    }

    public String receber(Pedido pedido) {
        return "O pedido já foi recebido";
    }
}