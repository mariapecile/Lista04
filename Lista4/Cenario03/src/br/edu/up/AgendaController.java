package Lista04.Cenario03;

import java.util.HashMap;
import java.util.Map;

public class AgendaController {
    private Map<String, Compromisso> compromissos;

    public AgendaController() {
        compromissos = new HashMap<>();
    }

    public void adicionarCompromisso(String data, Compromisso compromisso) {
        compromissos.put(data, compromisso);
    }

    public Compromisso getCompromisso(String data) {
        return compromissos.get(data);
    }
}