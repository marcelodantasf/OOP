import java.util.ArrayList;

public class Bomba {
    private ArrayList<Operacao> operacoes = new ArrayList<Operacao>();

    public void setOperacoes(ArrayList<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    public ArrayList<Operacao> getOperacoes() {
        return operacoes;
    }

    public void addOperacao(Operacao operacao) {
        this.operacoes.add(operacao);
        System.out.println("Operação adicionada com sucesso!");
    }

    public String toString() {
        String str = "";
        str += "Quantidade de operações realizadas pela bomba: " +
                this.operacoes.size();
        return str;
    }
}
