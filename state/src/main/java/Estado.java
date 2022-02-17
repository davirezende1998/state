public interface Estado {
    String getEstado();
    String realizar(Pedido pedido);
    String pagar(Pedido pedido);
    String entregar(Pedido pedido);
    String receber(Pedido pedido);
}