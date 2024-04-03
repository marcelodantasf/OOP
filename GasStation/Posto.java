import java.util.ArrayList;

public class Posto {
    private Tanque tanquePrincipal;
    private ArrayList<Bomba> bombas = new ArrayList<Bomba>();

    public void setTanquePrincipal(Tanque tanquePrincipal) {
        this.tanquePrincipal = tanquePrincipal;
    }

    public Tanque getTanquePrincipal() {
        return tanquePrincipal;
    }

    public void setBombas(ArrayList<Bomba> bombas) {
        this.bombas = bombas;
    }

    public ArrayList<Bomba> getBombas() {
        return bombas;
    }

    public void addBombas(Bomba bomba) {
        this.bombas.add(bomba);
        System.out.println("Bomba adicionada com sucesso!");
    }

    public void abastecer(int qtdCombustivel, Veiculo veiculo, Bomba bomba) {
        int newEstadoTanque = (veiculo.getTanqueVeiculo().getEstadoTanque()) + qtdCombustivel;
        if (newEstadoTanque > veiculo.getTanqueVeiculo().getCapacidade()) {
            System.out.println("Quantidade de gasolina ultrapassará a capacidade do tanque!");
        } else {
            if (this.tanquePrincipal.getEstadoTanque() < qtdCombustivel) {
                System.out.println("Quantidade de gasolina no tanque da bomba insuficiente");
            } else {
                this.tanquePrincipal.setEstadoTanque((tanquePrincipal.getEstadoTanque()) - qtdCombustivel);
                veiculo.getTanqueVeiculo().setEstadoTanque(newEstadoTanque);
                System.out.println("Abastecido com sucesso!");
                System.out.println("Nova reserva de gasolina no tanque: " + veiculo.getTanqueVeiculo().getEstadoTanque()
                        + " L");
                Operacao op = new Operacao("02/04", (qtdCombustivel * 5), qtdCombustivel, veiculo,
                        veiculo.getTanqueVeiculo());
                bomba.addOperacao(op);
                System.out.println("Numero de operações armazenadas na bomba: " + bomba.getNumOp());
            }
        }
    }

    public String toString() {
        String str = "";
        str = "Tanque principal do posto: " + tanquePrincipal +
                "\nQuantidade de bombas do posto: " + this.bombas.size();
        return str;
    }

    Posto(Tanque tanquePrincipal) {
        this.tanquePrincipal = tanquePrincipal;
    }
}