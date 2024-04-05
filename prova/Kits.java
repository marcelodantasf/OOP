public class Kits {
    private String complemento1;
    private String complemento2;

    public String getComplemento1() {
        return complemento1;
    }

    public void setComplemento1(String complemento1) {
        this.complemento1 = complemento1;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    Kits(String complemento1, String complemento2) {
        this.complemento1 = complemento1;
        this.complemento2 = complemento2;
    }

    public String toString() {
        String str = "";
        str += "Complemento 1: " + this.complemento1 +
                "\nComplemento 2: " + this.complemento2;
        return str;
    }

}
