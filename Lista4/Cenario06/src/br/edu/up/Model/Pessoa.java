// Model
public class Pessoa {
    private String nome;
    private String rg;

    // Construtor, getters e setters
}

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private Passagem passagem;

    // Construtor, getters e setters
}

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    // Construtor, getters e setters
}

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    // Construtor, getters e setters
}

public class Comissario extends Tripulacao {
    private List<String> idiomasFluencia;

    // Construtor, getters e setters
}

public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private LocalDateTime dataVoo;
    private Aeronave aeronave;

    // Construtor, getters e setters
}

public class Aeronave {
    private String codigo;
    private String tipo;
    private int quantidadeAssentos;

    // Construtor, getters e setters
}
