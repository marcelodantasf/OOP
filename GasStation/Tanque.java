public class Tanque {
    private int capacidade;
    private int estadoTanque;
    private int reserva;
    private int qtdCombustivel;

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setEstadoTanque(int estadoTanque) {
        this.estadoTanque = estadoTanque;
    }

    public int getEstadoTanque() {
        return estadoTanque;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public int getReserva() {
        return reserva;
    }

    public void setQtdCombustivel(int qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public int getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void abastecer(int qtdCombustivel) {
        this.estadoTanque += qtdCombustivel;
        System.out.println("Abastecido com sucesso!");
        System.out.println("Reserva de gasolina no tanque: " + this.estadoTanque);
    }

    public void completaTanque() {
        this.estadoTanque = this.capacidade;
    }

    Tanque(int capacidade, int estadoTanque, int reserva) {
        this.capacidade = capacidade;
        this.estadoTanque = estadoTanque;
        this.reserva = reserva;
    }

    public String toString() {
        String str = "";
        str += "Capacidade do tanque: " + this.capacidade +
                " L\nEstado atual do tanque: " + this.estadoTanque +
                " L\nReserva do tanque: " + this.reserva + " L";
        return str;
    }
}