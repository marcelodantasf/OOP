public class EventoPrivado extends Evento {
    private String nomeFantasia;
    private String cnpj;

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public EventoPrivado(String nome, String dataHora, String local, Organizador organizador, boolean isPublico, String nomeFantasia, String cnpj){
        super(nome, dataHora, local, organizador, isPublico);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
}