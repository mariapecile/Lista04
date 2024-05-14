// View
import java.util.Scanner;

public class EstacionamentoView {
    private EstacionamentoController controller;
    private Scanner scanner;

    public EstacionamentoView(EstacionamentoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("1. Entrada de veículo");
            System.out.println("2. Saída de veículo");
            System.out.println("3. Relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    entradaVeiculo();
                    break;
                case 2:
                    saidaVeiculo();
                    break;
                case 3:
                    exibirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void entradaVeiculo() {
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.next();
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.next();
        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.next();

        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        if (controller.entradaVeiculo(veiculo)) {
            System.out.println("Veículo estacionado com sucesso!");
        } else {
            System.out.println("Estacionamento lotado!");
        }
    }

    private void saidaVeiculo() {
        System.out.print("Digite a placa do veículo que deseja retirar: ");
        String placa = scanner.next();
        Veiculo veiculo = controller.saidaVeiculo(placa);
        if (veiculo != null) {
            System.out.println("Veículo com placa " + veiculo.getPlaca() + " retirado do estacionamento.");
        } else {
            System.out.println("Veículo não encontrado no estacionamento.");
        }
    }

    private void exibirRelatorio() {
        System .out.println("Total de veículos no estacionamento: " + controller.getTotalVeiculos());
        System.out.println("Valor a pagar: R$ " + controller.calcularPagamento());
    }
}



