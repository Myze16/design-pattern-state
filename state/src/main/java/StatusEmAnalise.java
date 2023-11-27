public class StatusEmAnalise extends ProdutoStatusAlfandega{
    private StatusEmAnalise() {};
    private static StatusEmAnalise instance = new StatusEmAnalise();
    public static StatusEmAnalise getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Em Analise";
    }

    public boolean taxar(Produto produto) {
        produto.setStatus(StatusTaxado.getInstance());
        return true;
    }

    public boolean liberar(Produto produto) {
        produto.setStatus(StatusLiberado.getInstance());
        return true;
    }

    public boolean retornar(Produto produto) {
        produto.setStatus(StatusRetornando.getInstance());
        return true;
    }
}
