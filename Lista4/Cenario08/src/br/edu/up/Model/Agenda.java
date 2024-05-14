import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void excluirContato(int indice) {
        contatos.remove(indice);
    }

    public Contato consultarContato(int indice) {
        return contatos.get(indice);
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
