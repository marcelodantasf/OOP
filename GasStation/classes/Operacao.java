public class Operacao {
    private String data;
    private double valor;
    private int qtdCombustivel;
    private Veiculo veiculo;
    private Tanque tanque;

    // implementar metodos get e set se tiver SACO pra isso

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setQtdCombustivel(int qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public int getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Tanque getTanque() {
        return tanque;
    }

    // usado para abastecer veiculos
    Operacao(String data, double valor, int qtdCombustivel, Veiculo veiculo, Tanque tanque) {
        this.data = data;
        this.valor = valor;
        this.qtdCombustivel = qtdCombustivel;
        this.veiculo = veiculo;
        this.tanque = tanque;
    }

    // usado para abastecer o tanque principal
    Operacao(String data, double valor, int qtdCombustivel, Tanque tanque) {
        this.data = data;
        this.valor = valor;
        this.qtdCombustivel = qtdCombustivel;
        this.tanque = tanque;
    }
}
