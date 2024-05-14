// Programa
public class Programa {
    public static void main(String[] args) {
        EventoController controller = new EventoController();
        EventoView view = new EventoView(controller);
        view.exibirMenu();
    }
}
