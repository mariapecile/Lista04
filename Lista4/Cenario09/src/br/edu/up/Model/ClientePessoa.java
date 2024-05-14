public class ClientePessoa extends Cliente {
    public ClientePessoa(String nome, String endereco) {
        super(nome, endereco, 10000); // Limite de crédito para cliente pessoa é de R$ 10.000,00
    }

    @Override
    public void emprestar(double valor) {
        double novoVlrEmprestado = getVlrEmprestado() + valor;
        if (novoVlrEmprestado <= getLimiteCredito()) {
            setVlrEmprestado(novoVlrEmprestado);
        } else {
            System.out.println("Limite de crédito excedido para cliente pessoa.");
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
