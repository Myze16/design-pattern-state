public abstract class ProdutoStatusAlfandega {
    public abstract String getStatus();

    public boolean taxar(Produto produto) {
        return false;
    }

    public boolean liberar(Produto produto) {
        return false;
    }

    public boolean retornar(Produto produto) {
        return false;
    }

    public boolean receberPagamento(Produto produto) {
        return false;
    }
}