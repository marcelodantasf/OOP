public class Percurso {
    private String nome;
    private int extensao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public Percurso(String nome, int extensao) {
        this.nome = nome;
        this.extensao = extensao;
    }

    public String toString() {
        String str = "";
        str += "Nome do percurso: " + this.nome +
                "\nExtensão do percurso: " + this.extensao + "km";
        return str;
    }

}
