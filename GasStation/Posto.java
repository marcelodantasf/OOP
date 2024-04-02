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

    public String toString() {
        String str = "";
        str = "Tanque principal do posto: " + tanquePrincipal +
                "\nQuantidade de bombas do posto: " + this.bombas.size();
        return str;
    }
}