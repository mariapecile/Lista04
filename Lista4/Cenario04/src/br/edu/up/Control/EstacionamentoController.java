// Controller
import java.util.ArrayList;
import java.util.List;

public class EstacionamentoController {
    private List<Veiculo> vagas;
    private double valorPorPeriodo = 5.0;

    public EstacionamentoController() {
        this.vagas = new ArrayList<>();
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagas.size() < 10) {
            vagas.add(veiculo);
            return true;
        }
        return false;
    }

    public Veiculo saidaVeiculo(String placa) {
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(veiculo);
                return veiculo;
            }
        }
        return null;
    }

    public int getTotalVeiculos() {
        return vagas.size();
    }

    public double calcularPagamento() {
        return vagas.size() * valorPorPeriodo;
    }
}
