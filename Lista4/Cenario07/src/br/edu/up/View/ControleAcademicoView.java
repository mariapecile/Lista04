// View
import java.util.Scanner;

public class ControleAcademicoView {
    private ControleAcademicoController controller;
    private Scanner scanner;

    public ControleAcademicoView(ControleAcademicoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Adicionar Aluno");
            System.out.println("3. Adicionar Disciplina");
            System.out.println("4. Listar Professores");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Disciplinas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarProfessor();
                    break;
                case 2:
                    adicionarAluno();
                    break;
                case 3:
                    adicionarDisciplina();
                    break;
                case 4:
                    listarProfessores();
                    break;
                case 5:
                    listarAlunos();
                    break;
                case 6:
                    listarDisciplinas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarProfessor() {
        // Implemente a lógica para adicionar um novo professor
    }

    private void adicionarAluno() {
        // Implemente a lógica para adicionar um novo aluno
    }

    private void adicionarDisciplina() {
        // Implemente a lógica para adicionar uma nova disciplina
    }

    private void listarProfessores() {
        // Implemente a lógica para listar os professores
    }

    private void listarAlunos() {
        // Implemente a lógica para listar os alunos
    }

    private void listarDisciplinas() {
        // Implemente a lógica para listar as disciplinas
    }
}
