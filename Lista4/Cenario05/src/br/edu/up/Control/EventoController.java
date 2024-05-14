// Controller
import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoController() {
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void realizarReserva(Evento evento, Reserva reserva) {
        evento.setIngressosVendidos(evento.getIngressosVendidos() + reserva.getQuantidadePessoas());
        reserva.setValorTotal(reserva.getQuantidadePessoas() * evento.getPrecoIngresso());
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
