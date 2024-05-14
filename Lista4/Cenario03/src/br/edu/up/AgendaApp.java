package Lista04.Cenario03;

//*Classe Principal */
public class AgendaApp {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();

        Compromisso compromisso1 = new Compromisso("João", "Café Central", "10:00", "Reunião de Negócios");
        Compromisso compromisso2 = new Compromisso("Maria", "Escritório", "14:30", "Apresentação de Projeto");

        controller.adicionarCompromisso("2024-05-13", compromisso1);
        controller.adicionarCompromisso("2024-05-14", compromisso2);

        Compromisso compromissoRecuperado = controller.getCompromisso("2024-05-13");
        view.exibirCompromisso("2024-05-13", compromissoRecuperado);
    }
}
