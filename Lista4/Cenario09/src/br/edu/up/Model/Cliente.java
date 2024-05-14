public abstract class Cliente {
    private String nome;
    private String endereco;
    private double vlrEmprestado;
    private double limiteCredito;

    public Cliente(String nome, String endereco, double limiteCredito) {
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
        this.vlrEmprestado = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);

    protected void setVlrEmprestado(double valor) {
        vlrEmprestado = valor;
    }

    protected double getLimiteCredito() {
        return limiteCredito;
    }
}
