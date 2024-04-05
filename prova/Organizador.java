import java.util.ArrayList;

public class Organizador {
    private String nome;
    private String email;
    private String senha;

    private ArrayList<Evento> eventos = new ArrayList<Evento>();

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    Organizador(String nome, String email, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String toStringOrg() {
        String str = "Nome: " + this.nome +
                "\nSenha: " + this.senha +
                "\nEmail: " + this.email;
        return str;
    }

    public void addEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " atribuído ao organizador " + this.nome);
    }

}
