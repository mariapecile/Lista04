// View
import java.util.List;
import java.util.Scanner;

public class EventoView {
    private EventoController controller;
    private Scanner scanner;

    public EventoView(EventoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("1. Adicionar evento");
            System.out.println("2. Remover evento");
            System.out.println("3. Listar eventos");
            System.out.println("4. Realizar reserva");
            System.out.println("5. Cancelar reserva");
            System.out.println("6. Listar reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    removerEvento();
                    break;
                case 3:
                    listarEventos();
                    break;
                case 4:
                    realizarReserva();
                    break;
                case 5:
                    cancelarReserva();
                    break;
                case 6:
                    listarReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarEvento() {
        
    }

    private void removerEvento() {
        
    }

    private void listarEventos() {
        List<Evento> eventos = controller.listarEventos();
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    private void realizarReserva() {
       

    private void cancelarReserva() {
        
    }

    private void listarReservas() {
        List<Reserva> reservas = controller.listarReservas();
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
