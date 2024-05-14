// Programa
public class Programa {
    public static void main(String[] args) {
        ControleTrafegoController controller = new ControleTrafegoController();
        ControleTrafegoView view = new ControleTrafegoView(controller);
        view.exibirMenu();
    }
}
