public class Inscrito extends Pessoa {
    private boolean isPagante;

    public boolean isPagante() {
        return isPagante;
    }

    public void setPagante(boolean isPagante) {
        this.isPagante = isPagante;
    }

    public Inscrito(String nome, String cpf, String dataNascimento, String endereco, boolean isPagante){
        super(nome, cpf, dataNascimento, endereco);
        this.isPagante = isPagante;
    }
}