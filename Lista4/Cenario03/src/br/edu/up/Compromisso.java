package Lista04.Cenario03;

public class Compromisso {
    public String pessoa;
    public String local;
    public String horario;
    public String assunto;

    public Compromisso(String pessoa, String local, String horario, String assunto) {
        this.pessoa = pessoa;
        this.local = local;
        this.horario = horario;
        this.assunto = assunto;
    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public String getHorario() {
        return horario;
    }

    public String getAssunto() {
        return assunto;
    }
}