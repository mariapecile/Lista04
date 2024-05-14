// Programa
public class Programa {
    public static void main(String[] args) {
        ControleAcademicoController controller = new ControleAcademicoController();
        ControleAcademicoView view = new ControleAcademicoView(controller);
        view.exibirMenu();
    }
}
