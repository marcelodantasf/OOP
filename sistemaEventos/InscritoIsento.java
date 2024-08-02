public class InscritoIsento extends Inscrito{
    private String just;

    public String getJust() {
        return just;
    }

    public void setJust(String just) {
        this.just = just;
    }

    public InscritoIsento(String nome, String cpf, String dataNascimento, String endereco, boolean isPagante, String just){
        super(nome, cpf, dataNascimento, endereco, isPagante);
        this.just = just;
    }
}
