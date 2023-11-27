public class StatusTaxado extends ProdutoStatusAlfandega{
    private StatusTaxado() {};
    private static StatusTaxado instance = new StatusTaxado();
    public static StatusTaxado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Taxado";
    }

    public boolean receberPagamento(Produto produto) {
        produto.setStatus(StatusAguardandoPagamento.getInstance());
        return true;
    }
}
