public class Evento{
    private String nome;
    private String dataHora;
    private String local;
    private Organizador organizador;
    private boolean isPublico;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setDataHora(String dataHora){
        this.dataHora = dataHora;
    }

    public String getDataHora(){
        return dataHora;
    }

    
    public void setLocal(String local){
        this.local = local;
    }

    public String getLocal(){
        return local;
    }

    public void setOrganizador(Organizador organizador){
        this.organizador = organizador;
    }

    public Organizador getOrganizador(){
        return organizador;
    }

    public void setIsPublico(boolean isPublico){
        this.isPublico = isPublico;
    }

    public boolean getIsPrivate(){
        return isPublico;
    }

    public Evento(String nome, String dataHora, String local, Organizador organizador, boolean isPublico){
        this.nome = nome;
        this.dataHora = dataHora;
        this.local = local;
        this.organizador = organizador;
        this.isPublico = isPublico;
    }
}