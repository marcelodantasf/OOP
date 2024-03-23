public class Teste {
    public static void main(String[] args) {

        Locomotiva loc1 = new Locomotiva("ASD001", 15.5, 13);
        Locomotiva loc2 = new Locomotiva("CDB12", 18, 19);
        Vagao vag1 = new Vagao("CVD001", "Transporte", 15, 2, 3);
        Vagao vag2 = new Vagao("CVD002", "Transporte", 15, 2, 3);
        Vagao vag3 = new Vagao("CVD003", "Transporte", 15, 2, 3);

        Linhas linha1 = new Linhas(1, 24.1, "Linha Sul");
        linha1.addRecursos(new RecursosFerroviarios(loc1));
        linha1.addRecursos(new RecursosFerroviarios(vag3));
        Estacao origem = new Estacao("BFC", "Estação Benfica");
        origem.addLinha(linha1);

        Linhas linha2 = new Linhas(2, 13.2, "Linha Nordeste | VLT Parangaba-Mucuripe");
        linha2.addRecursos(new RecursosFerroviarios(vag2));
        Estacao destino = new Estacao("PPC", "Estação Papicu");

        Trem t1 = new Trem("ETR200", "2024-03-22", origem, destino);
        t1.addRecursos(new RecursosFerroviarios(loc2));
        t1.addRecursos(new RecursosFerroviarios(vag1));

        System.out.println(t1.toString());

        System.out.println("\nDADOS DA ESTAÇÃO DE ORIGEM:");
        System.out.println(origem.toString());
        System.out.println("\nLINHAS CONTEMPLADAS:");
        System.out.println(linha1.toString());
        System.out.println("\nLOCOMOTIVAS DA LINHA:");
        System.out.println(loc1.toString());
        System.out.println("\nVAGÕES DA LINHA:");
        System.out.println(vag3.toString());

        System.out.println("\nDADOS DA ESTAÇÃO DE DESTINO:");
        System.out.println(destino.toString());
        System.out.println("\nLINHAS CONTEMPLADAS:");
        System.out.println(linha2.toString());
        System.out.println("\nLOCOMOTIVAS DA LINHA:");
        System.out.println(loc2.toString());
        System.out.println("\nVAGÕES DA LINHA:");
        System.out.println(vag2.toString());
        System.out.println("");
        System.out.println(vag1.toString());
    }
}