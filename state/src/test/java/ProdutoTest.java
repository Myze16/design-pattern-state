import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProdutoTest {
    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto();
    }

    @Test
    public void deveMudarStatusParaLiberado() {
        produto.liberar();
        assertEquals(StatusLiberado.getInstance(), produto.getStatus());
    }

    @Test
    public void deveMudarStatusParaTaxado() {
        produto.taxar();
        assertEquals(StatusTaxado.getInstance(), produto.getStatus());
    }

    @Test
    public void deveMudarStatusParaAguardandoPagamento() {
        produto.setStatus(StatusTaxado.getInstance());
        produto.receberPagamento();
        assertEquals(StatusAguardandoPagamento.getInstance(), produto.getStatus());
    }

    @Test
    public void deveMudarStatusPagamentoParaLiberado() {
        produto.setStatus(StatusAguardandoPagamento.getInstance());
        produto.liberar();
        assertEquals(StatusLiberado.getInstance(), produto.getStatus());
    }

    @Test
    public void deveMudarStatusPararetornando() {
        produto.retornar();
        assertEquals(StatusRetornando.getInstance(), produto.getStatus());
    }
}
