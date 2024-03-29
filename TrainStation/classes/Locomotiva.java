public class Locomotiva {
    /*
     * Uma locomotiva é descrita por um número de série, capacidade de tração e
     * comprimento,
     * também podendo ser opcionalmente informados durante a sua criação.
     */
    private String serial;
    private double comprimento;
    private double tracao;

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setTracao(double tracao) {
        this.tracao = tracao;
    }

    public double getTracao() {
        return tracao;
    }

    public String toString() {
        String str = "";
        str += "Número de série: " + this.serial +
                "\nComprimento: " + this.comprimento + " m" +
                "\nCapacidade de tração: " + this.tracao + " kJ";
        return str;
    }

    Locomotiva(String serial, double comprimento, double tracao) {
        this.serial = serial;
        this.comprimento = comprimento;
        this.tracao = tracao;
    }
}
