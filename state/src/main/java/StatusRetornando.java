public class StatusRetornando extends ProdutoStatusAlfandega{

    private StatusRetornando() {};
    private static StatusRetornando instance = new StatusRetornando();
    public static StatusRetornando getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Retornando para local de origem";
    }
}
