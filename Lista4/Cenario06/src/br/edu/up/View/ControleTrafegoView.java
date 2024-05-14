// View
import java.util.Scanner;

public class ControleTrafegoView {
    private ControleTrafegoController controller;
    private Scanner scanner;

    public ControleTrafegoView(ControleTrafegoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulação");
            System.out.println("3. Listar Passageiros");
            System.out.println("4. Listar Tripulação");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulacao();
                    break;
                case 3:
                    listarPassageiros();
                    break;
                case 4:
                    listarTripulacao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarPassageiro() {
        // Implemente a lógica para adicionar um novo passageiro
    }

    private void adicionarTripulacao() {
        // Implemente a lógica para adicionar um novo membro de tripulação
    }

    private void listarPassageiros() {
        // Implemente a lógica para listar os passageiros
    }

    private void listarTripulacao() {
        // Implemente a lógica para listar a tripulação
    }
}
