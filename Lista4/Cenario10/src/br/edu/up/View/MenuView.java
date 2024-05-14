import java.util.Scanner;

public class Menu {
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        SeguroManager seguroManager = new SeguroManager();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Implementar inclusão de seguro
                    break;
                case 2:
                    // Implementar localização de seguro
                    break;
                case 3:
                    // Implementar exclusão de seguro
                    break;
                case 4:
                    // Implementar exclusão de todos os seguros
                    break;
                case 5:
                    // Implementar listagem de todos os seguros
                    break;
                case 6:
                    // Implementar visualização da quantidade de seguros
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 7);
    }
}
