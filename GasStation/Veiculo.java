public class Veiculo {
    private int potencia;
    private String placa;
    private Pessoa proprietario;
    private Tanque tanqueVeiculo;

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setTanqueVeiculo(Tanque tanqueVeiculo) {
        this.tanqueVeiculo = tanqueVeiculo;
    }

    public Tanque getTanqueVeiculo() {
        return tanqueVeiculo;
    }

    Veiculo(int potencia, String placa, Pessoa proprietario, Tanque tanqueVeiculo) {
        this.potencia = potencia;
        this.placa = placa;
        this.proprietario = proprietario;
        this.tanqueVeiculo = tanqueVeiculo;
    }

    public void acelerar() {
        int combustivelConsumido = (potencia / 10); // Em litros
        if ((this.tanqueVeiculo.getEstadoTanque()) < combustivelConsumido) {
            System.out.println("Sem combustível suficiente para acelerar");
        } else {
            int newEstadoTanque = (this.tanqueVeiculo.getEstadoTanque()) - combustivelConsumido;
            this.tanqueVeiculo.setEstadoTanque(newEstadoTanque);
            System.out.println("Acelerando!");
            System.out.println("Novo estado do tanque: " + this.tanqueVeiculo.getEstadoTanque());
        }

        if (this.tanqueVeiculo.getEstadoTanque() <= this.tanqueVeiculo.getReserva())
            System.out.println("ALERTA! Seu tanque está na reserva.");
    }

    public String toString() {
        String str = "";
        str += "Potência do veículo: " + this.potencia +
                "CV\nPlaca do veículo: " + this.placa +
                "\nProprietário do veículo: " + this.proprietario;
        return str;
    }

    /*
     * public static void main(String[] args) {
     * Pessoa carlos = new Pessoa("Carlos", "123.456.789-01");
     * Tanque tanqueCarro = new Tanque(250, 60, 15);
     * Veiculo carro = new Veiculo(150, "OIJ2865", carlos, tanqueCarro);
     * 
     * System.out.println(carro.toString());
     * System.out.println(tanqueCarro.toString());
     * System.out.println("");
     * carro.acelerar();
     * carro.acelerar();
     * 
     * REMOVA O COMENTARIO PARA TESTAR O FUNCIONAMENTO DO VEICULO
     * }
     */
}