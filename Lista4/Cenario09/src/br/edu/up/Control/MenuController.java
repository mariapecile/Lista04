public class MenuController {
    private MenuView view;
    private ClientePessoa clientePessoa;
    private ClienteEmpresa clienteEmpresa;

    public MenuController(MenuView view) {
        this.view = view;
        this.clientePessoa = null;
        this.clienteEmpresa = null;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    String nomePessoa = view.lerNome();
                    String enderecoPessoa = view.lerEndereco();
                    clientePessoa = new ClientePessoa(nomePessoa, enderecoPessoa);
                    break;
                case 2:
                    String nomeEmpresa = view.lerNome();
                    String enderecoEmpresa = view.lerEndereco();
                    clienteEmpresa = new ClienteEmpresa(nomeEmpresa, enderecoEmpresa);
                    break;
                case 3:
                    if (clientePessoa != null) {
                        System.out.println("Nome: " + clientePessoa.getNome());
                        System.out.println("Endereço: " + clientePessoa.getEndereco());
                        System.out.println("Valor emprestado: " + clientePessoa.getVlrEmprestado());
                    } else {
                        System.out.println("Cliente pessoa não cadastrado.");
                    }
                    break;
                case 4:
                    if (clienteEmpresa != null) {
                        System.out.println("Nome: " + clienteEmpresa.getNome());
                        System.out.println("Endereço: " + clienteEmpresa.getEndereco());
                        System.out.println("Valor emprestado: " + clienteEmpresa.getVlrEmprestado());
                    } else {
                        System.out.println("Cliente empresa não cadastrado.");
                    }
                    break;
                case 5:
                    if (clientePessoa != null) {
                        double valorEmprestimoPessoa = view.lerValor();
                        clientePessoa.emprestar(valorEmprestimoPessoa);
                    } else {
                        System.out.println("Cliente pessoa não cadastrado.");
                    }
                    break;
                case 6:
                    if (clienteEmpresa != null) {
                        double valorEmprestimoEmpresa = view.lerValor();
                        clienteEmpresa.emprestar(valorEmprestimoEmpresa);
                    } else {
                        System.out.println("Cliente empresa não cadastrado.");
                    }
                    break;
                case 7:
                    if (clientePessoa != null) {
                        double valorDevolucaoPessoa = view.lerValor();
                        clientePessoa.devolver(valorDevolucaoPessoa);
                    } else {
                        System.out.println("Cliente pessoa não cadastrado.");
                    }
                    break;
                case 8:
                    if (clienteEmpresa != null) {
                        double valorDevolucaoEmpresa = view.lerValor();
                        clienteEmpresa.devolver(valorDevolucaoEmpresa);
                    } else {
                        System.out.println("Cliente empresa não cadastrado.");
                    }
                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);
    }
}
