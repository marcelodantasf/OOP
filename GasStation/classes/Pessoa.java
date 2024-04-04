public class Pessoa {
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        String str = "";
        str += "Nome: " + this.nome +
                "\nCPF: " + this.cpf;
        return str;
    }
}