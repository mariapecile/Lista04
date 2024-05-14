// Controller
import java.util.ArrayList;
import java.util.List;

public class ControleTrafegoController {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;

    public ControleTrafegoController() {
        this.passageiros = new ArrayList<>();
        this.tripulacao = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void adicionarTripulacao(Tripulacao membroTripulacao) {
        tripulacao.add(membroTripulacao);
    }

    // Métodos para listagem, remoção e outras operações necessárias
}
