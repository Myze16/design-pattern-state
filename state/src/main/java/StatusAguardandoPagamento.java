public class StatusAguardandoPagamento extends ProdutoStatusAlfandega{
    private StatusAguardandoPagamento() {};
    private static StatusAguardandoPagamento instance = new StatusAguardandoPagamento();
    public static StatusAguardandoPagamento getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Aguardando Pagamento";
    }

    public boolean liberar(Produto produto) {
        produto.setStatus(StatusLiberado.getInstance());
        return true;
    }
}
