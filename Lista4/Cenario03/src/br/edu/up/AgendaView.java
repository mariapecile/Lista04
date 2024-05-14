package Lista04.Cenario03;

public class AgendaView {
    public void exibirCompromisso(String data, Compromisso compromisso) {
        if (compromisso != null) {
            System.out.println("Compromisso encontrado para " + data + ":");
            System.out.println("Pessoa: " + compromisso.getPessoa());
            System.out.println("Local: " + compromisso.getLocal());
            System.out.println("Horário: " + compromisso.getHorario());
            System.out.println("Assunto: " + compromisso.getAssunto());
        } else {
            System.out.println("Nenhum compromisso encontrado para " + data);
        }
    }
}
