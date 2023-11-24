public class Produto {
    private String produto;
    private ProdutoStatusAlfandega status;

    public Produto() {
        this.status = StatusEmAnalise.getInstance();
    }

    public void setStatus(ProdutoStatusAlfandega status) {
        this.status = status;
    }

    public boolean taxar() {
        return status.taxar(this);
    }

    public boolean liberar() {
        return status.liberar(this);
    }

    public boolean retornar() {
        return status.retornar(this);
    }

    public boolean receberPagamento() {
        return status.receberPagamento(this);
    }

    public ProdutoStatusAlfandega getStatus() {
        return status;
    }
}
