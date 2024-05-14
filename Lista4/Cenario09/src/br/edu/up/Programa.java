public class Programa {
    public static void main(String[] args) {
        MenuView view = new MenuView();
        MenuController controller = new MenuController(view);
        controller.iniciar();
    }
}
