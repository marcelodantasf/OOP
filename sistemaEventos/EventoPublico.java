public class EventoPublico extends Evento {
    private String nomePrefeitura;
    private String cidade;

    public void setNomePrefeitura(String nomePrefeitura){
        this.nomePrefeitura = nomePrefeitura;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getNomePrefeitura(){
        return nomePrefeitura;
    }

    public String getCidade(){
        return cidade;
    }

    public EventoPublico(String nome, String dataHora, String local, Organizador organizador,
    boolean isPublico, String nomePrefeitura, String cidade) {
        super(nome, dataHora, local, organizador, isPublico);
        this.nomePrefeitura = nomePrefeitura;
        this.cidade = cidade;
    }
}