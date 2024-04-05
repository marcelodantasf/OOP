public class Participante {
    private String nome;
    private String email;
    private String senha;
    private int numeroPeito;
    private String tamCamisa;
    private double tempo;
    private Percurso percursoEscolhido;

    public Percurso getPercursoEscolhido() {
        return percursoEscolhido;
    }

    public void setPercursoEscolhido(Percurso percursoEscolhido) {
        this.percursoEscolhido = percursoEscolhido;
        System.out.println(this.nome + " escolheu o percurso " + this.percursoEscolhido.getNome() + "\n");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumPeito(int numeroPeito) {
        this.numeroPeito = numeroPeito;
    }

    public void setTamCamisa(String tamCamisa) {
        this.tamCamisa = tamCamisa;
    }

    public double getTempo() {
        return tempo;
    }

    public String getTamCamisa() {
        return tamCamisa;
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

    public int getNumPeito() {
        return numeroPeito;
    }

    Participante(String nome, String email, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String toString() {
        String str = "";
        str += "Nome: " + this.nome +
                "\nSenha: " + this.senha +
                "\nEmail: " + this.email;
        return str;
    }
}