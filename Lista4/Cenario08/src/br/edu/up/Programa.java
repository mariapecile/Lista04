public class Programa {
    public static void main(String[] args) {
        MenuView view = new MenuView();
        Agenda agenda = new Agenda();
        MenuController controller = new MenuController(view, agenda);
        controller.iniciar();
    }
}
