public class ClienteEmpresa extends Cliente {
    public ClienteEmpresa(String nome, String endereco) {
        super(nome, endereco, 25000); // Limite de crédito para cliente empresa é de R$ 25.000,00
    }

    @Override
    public void emprestar(double valor) {
        double novoVlrEmprestado = getVlrEmprestado() + valor;
        if (novoVlrEmprestado <= getLimiteCredito()) {
            setVlrEmprestado(novoVlrEmprestado);
        } else {
            System.out.println("Limite de crédito excedido para cliente empresa.");
        }
    }

    @Override
    public void devolver(double valor) {
        double novoVlrEmprestado = getVlrEmprestado() - valor;
        if (novoVlrEmprestado >= 0) {
            setVlrEmprestado(novoVlrEmprestado);
        } else {
            System.out.println("Valor de devolução excede o valor emprestado.");
        }
    }
}
