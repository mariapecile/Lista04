// Model
public class Pessoa {
    private String nome;
    private String rg;
    private String matricula;

    
}

public class Professor extends Pessoa {
    private String curriculumLattes;
    private Titulacao titulacao;

    
}

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String nomeCurso;
    private String turno;

    
}

public class Titulacao {
    private String instituicao;
    private int anoConclusao;
    private String tituloObtido;
    private String tituloTrabalhoConclusao;


}

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competenciasNecessarias;
    private List<Competencia> competenciasComplementares;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

}

public class Competencia {
    private String nome;
    private Situacao situacao;

}

public enum Situacao {
    Atingida, NaoAtingida
}
