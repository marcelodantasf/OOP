public class Teste{
    public static void main(String[] args){

        Locomotiva loc1 = new Locomotiva("ASD001", 15.5, 13);
        Vagao vag1 = new Vagao("CVD001", "transporte", 15, 2, 3);
        Vagao vag2 = new Vagao("CVD002", "transporte", 15, 2, 3);
        Vagao vag3 = new Vagao("CVD003", "transporte", 15, 2, 3);

        Trem t1 = new Trem("FOR", "2024-03-22", "Fortaleza", "Maracanau");

        Linhas linha = new Linhas();

    } 
}