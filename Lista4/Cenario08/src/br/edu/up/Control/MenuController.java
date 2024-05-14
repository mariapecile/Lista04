import java.util.List;

public class MenuController {
    private MenuView view;
    private Agenda agenda;

    public MenuController(MenuView view, Agenda agenda) {
        this.view = view;
        this.agenda = agenda;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Contato contato = view.lerContato();
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    Contato contatoComercial = view.lerContato();
                    agenda.adicionarContato(contatoComercial);
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigo();
                    agenda.excluirContato(codigoExcluir);
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigo();
                    Contato contatoConsultado = agenda.consultarContato(codigoConsultar);
                    view.mostrarContato(contatoConsultado);
                    break;
                case 5:
                    List<Contato> contatos = agenda.listarContatos();
                    view.mostrarTodosContatos(contatos);
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);
    }
}
