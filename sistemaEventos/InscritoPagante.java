public class InscritoPagante extends Inscrito{
    private float valorInscricao;

    public float getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(float valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public InscritoPagante(String nome, String cpf, String dataNascimento, String endereco, boolean isPagante, float valorInscricao){
        super(nome, cpf, dataNascimento, endereco, isPagante);
        this.valorInscricao = valorInscricao;
    }
}
