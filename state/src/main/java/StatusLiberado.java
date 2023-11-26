public class StatusLiberado extends ProdutoStatusAlfandega{
    private StatusLiberado() {};
    private static StatusLiberado instance = new StatusLiberado();

    public static StatusLiberado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Liberado";
    }
}
