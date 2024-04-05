import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private Organizador organizador;
    private String data;
    private int limiteParticipantes;
    private Kits kitEvento;
    private ArrayList<Percurso> percursos = new ArrayList<Percurso>();
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    private int numInscricao;
    private List<Participante> ranking = new ArrayList<Participante>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Kits getKitEvento() {
        return kitEvento;
    }

    public void setKitEvento(Kits kitEvento) {
        this.kitEvento = kitEvento;
    }

    public List<Participante> getRanking() {
        return ranking;
    }

    public void setRanking(List<Participante> ranking) {
        this.ranking = ranking;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getLimiteParticipantes() {
        return limiteParticipantes;
    }

    public void setLimiteParticipantes(int limiteParticipantes) {
        this.limiteParticipantes = limiteParticipantes;
    }

    public ArrayList<Percurso> getPercursos() {
        return percursos;
    }

    public void setPercursos(ArrayList<Percurso> percursos) {
        this.percursos = percursos;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public int getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(int numInscricao) {
        this.numInscricao = numInscricao;
    }

    Evento(Organizador organizador, String data, int limiteParticipantes, Kits kitEvento, String nome) {
        this.organizador = organizador;
        this.data = data;
        this.limiteParticipantes = limiteParticipantes;
        this.numInscricao = 1;
        this.kitEvento = kitEvento;
        this.nome = nome;
    }

    public void addPercurso(Percurso percurso) {
        percursos.add(percurso);
        System.out.println("\nPercurso " + percurso.getNome() + " adicionado");
    }

    public void verPercursos() {
        for (int i = 0; i < percursos.size(); i++) {
            System.out.println(percursos.get(i).getNome());
        }
    }

    public void inscreverParticipantes(Participante participante, String tamCamisa) {
        if (this.participantes.size() <= this.limiteParticipantes) {
            participante.setTamCamisa(tamCamisa);
            this.participantes.add(participante);
            System.out.println("Participante " + participante.getNome() + " adicionado");
            System.out.println("Tamanho da camisa do participante: " + participante.getTamCamisa() + "\n");
            participante.setNumPeito(numInscricao);
            this.numInscricao++;
        } else {
            System.out.println("Limite atingido");
        }
    }

    public String toString() {
        String str = "";
        str += "Organizador: " + this.organizador.getNome() +
                "\nData: " + this.data +
                "\nLimite de participantes: " + this.limiteParticipantes +
                "\nParticipantes: " + participantes.toString() +
                "\nKit do evento: " + this.kitEvento.toString();
        return str;
    }

    public void definirTempo(Participante participante, double tempo) {
        participante.setTempo(tempo);
        System.out.println("Tempo do participante: " + participante.getTempo() + "s");
    }

    public void criarRanking() {
        Participante aux;
        ranking.addAll(participantes);
        for (int i = 0; i < ranking.size(); i++) {
            for (int j = 0; j < ranking.size() - 1; j++) {
                if (ranking.get(j).getTempo() > ranking.get(j + 1).getTempo()) {

                    aux = ranking.get(i);
                    ranking.set(i, ranking.get(j));
                    ranking.set(j, aux);
                }
            }
        }

        System.out.println("\nRanking de tempo:");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + "º:\n" + ranking.get(i));
            System.out.println("Tempo: " + ranking.get(i).getTempo());
            System.out.println("");
        }
    }

}
