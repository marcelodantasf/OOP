public class Teste {
    public static void main(String[] args) {
        Pessoa carlos = new Pessoa("Carlos", "123.456.789-01");
        Tanque tanqueCarro = new Tanque(100, 60, 15);
        Veiculo carro = new Veiculo(150, "OIJ2865", carlos, tanqueCarro);
        Tanque tanquePosto = new Tanque(5000, 1800, 500);
        Bomba bomba1 = new Bomba();
        Posto posto = new Posto(tanquePosto);
        posto.addBombas(bomba1);

        System.out.println(carro.toString());
        System.out.println(tanqueCarro.toString());
        System.out.println("");
        carro.acelerar();
        carro.acelerar();
        System.out.println("");
        posto.abastecer(10, carro, bomba1);
        System.out.println("");
        System.out.println("");
        System.out.println(posto.toString());
        System.out.println("");
        System.out.println(bomba1.toString());
        System.out.println("");
        posto.getTanquePrincipal().completaTanque();
        System.out.println("Novo estado do tanque da bomba: " + posto.getTanquePrincipal().getEstadoTanque() + "L");
    }
}
