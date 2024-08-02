public class Pessoa{
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public String toString(){
        String str = "";
        str += "nome: " + this.nome
        + "\ncpf: " + this.cpf
        + "\ndata de nascimento: " + this.dataNascimento
        + "\nendereço: " + this.endereco;
        return str;
    }

    public Pessoa(String nome, String cpf, String dataNascimento, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this. dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}