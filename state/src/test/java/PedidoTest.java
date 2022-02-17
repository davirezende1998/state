import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    //TESTES PARA PEDIDO REALIZADO-----------------------------------
    @Test
    public void naoDeveRealizarPedidoRealizado() {
        pedido.setEstado(Realizado.getInstance());
        assertEquals("O pedido já foi realizado", pedido.realizar());
    }

    @Test
    public void devePagarPedidoRealizado() {
        pedido.setEstado(Realizado.getInstance());
        assertEquals("Pagamento realizado", pedido.pagar());
    }

    @Test
    public void naoDeveEntregarPedidoRealizado() {
        pedido.setEstado(Realizado.getInstance());
        assertEquals("O pedido precisa ser pago antes de ir para a entrega", pedido.entregar());
    }

    @Test
    public void naoDeveReceberPedidoRealizado() {
        pedido.setEstado(Realizado.getInstance());
        assertEquals("O pedido ainda não foi pago.", pedido.receber());
    }

    //TESTES PARA PEDIDO PAGO-----------------------------------
    @Test
    public void naoDeveRealizarPedidoPago() {
        pedido.setEstado(Pago.getInstance());
        assertEquals("O pedido já foi realizado e pago", pedido.realizar());
    }

    @Test
    public void naoDevePagarPedidoPago() {
        pedido.setEstado(Pago.getInstance());
        assertEquals("O pedido já foi pago", pedido.pagar());
    }

    @Test
    public void deveEntregarPedidoPago() {
        pedido.setEstado(Pago.getInstance());
        assertEquals("O pedido saiu para entrega", pedido.entregar());
    }

    @Test
    public void naoDeveReceberPedidoPago() {
        pedido.setEstado(Pago.getInstance());
        assertEquals("O pedido ainda não saiu para entrega", pedido.receber());
    }

    //TESTES PARA PEDIDO EM ENTREGA-----------------------------------
    @Test
    public void naoDeveRealizarPedidoEmEntrega() {
        pedido.setEstado(EmEntrega.getInstance());
        assertEquals("O pedido já está em rota de entrega", pedido.realizar());
    }

    @Test
    public void naoDevePagarPedidoEmEntrega() {
        pedido.setEstado(EmEntrega.getInstance());
        assertEquals("O pedido já está em rota de entrega", pedido.pagar());
    }

    @Test
    public void naoDeveEntregarPedidoEmEntrega() {
        pedido.setEstado(EmEntrega.getInstance());
        assertEquals("O pedido já está em rota de entrega", pedido.entregar());
    }

    @Test
    public void deveReceberPedidoEmEntrega() {
        pedido.setEstado(EmEntrega.getInstance());
        assertEquals("O pedido está quase chegando", pedido.receber());
    }

    //TESTES PARA PEDIDO RECEBIDO-----------------------------------
    @Test
    public void naoDeveRealizarPedidoRecebido() {
        pedido.setEstado(Recebido.getInstance());
        assertEquals("O pedido já foi recebido", pedido.realizar());
    }

    @Test
    public void naoDevePagarPedidoRecebido() {
        pedido.setEstado(Recebido.getInstance());
        assertEquals("O pedido já foi recebido", pedido.pagar());
    }

    @Test
    public void naoDeveEntregarPedidoRecebido() {
        pedido.setEstado(Recebido.getInstance());
        assertEquals("O pedido já foi recebido", pedido.entregar());
    }

    @Test
    public void NaoDeveReceberPedidoRecebido() {
        pedido.setEstado(Recebido.getInstance());
        assertEquals("O pedido já foi recebido", pedido.receber());
    }
}