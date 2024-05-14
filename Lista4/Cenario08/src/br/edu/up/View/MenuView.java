import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Contato lerContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.next();
        return new ContatoPessoal(nome, telefone); // Supondo que seja sempre um contato pessoal
    }

    public int lerCodigo() {
        System.out.print("Digite o código do contato: ");
        return scanner.nextInt();
    }

    public void mostrarContato(Contato contato) {
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
    }

    public void mostrarTodosContatos(List<Contato> contatos) {
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            mostrarContato(contato);
        }
    }
}
