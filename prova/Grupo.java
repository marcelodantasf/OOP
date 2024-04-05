import java.util.ArrayList;

public class Grupo {
    private Participante fundador;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();

    public void setFundador(Participante fundador) {
        this.fundador = fundador;
    }

    public Participante getFundador() {
        return fundador;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    Grupo(Participante fundador) {
        this.fundador = fundador;
        participantes.add(fundador);
    }

    public void addParticipante(Participante integrante) {
        participantes.add(integrante);
        System.out.println("Participante " + integrante.getNome() + " Adicionado");
        System.out.println("Número de participantes do grupo: " + participantes.size() + "\n");
    }

    public void verParticipantes() {
        System.out.println("Participantes do grupo: " + participantes.toString());
    }

}
