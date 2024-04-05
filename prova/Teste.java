public class Teste {
    public static void main(String[] args) {
        Organizador org = new Organizador("carlos", "email", "senha");
        System.out.println(org.toStringOrg());

        Participante participante1 = new Participante("Carlito", "carlito@email.com", "123");
        Participante participante2 = new Participante("Josefina", "josefina@email.com", "123");
        Participante participante3 = new Participante("Ajalmar", "ajalmar@email.com", "123");
        Participante participante4 = new Participante("Sandro", "sandro@email.com", "123");
        System.out.println("");

        Grupo g1 = new Grupo(participante4);
        g1.addParticipante(participante3);
        g1.addParticipante(participante1);
        g1.verParticipantes();
        System.out.println("");

        Percurso percurso1 = new Percurso("Lagoa", 10);
        System.out.println(percurso1.toString());
        System.out.println("");

        Kits kitCopo = new Kits("água indaiá 500ml", "copo logo");

        Evento evento1 = new Evento(org, "16/04/2024", 10, kitCopo, "Circuito Marapomba");
        evento1.addPercurso(percurso1);
        System.out.println("");
        System.out.println("Percursos disponíveis:");
        evento1.verPercursos();
        System.out.println("");

        evento1.inscreverParticipantes(participante4, "G");
        participante4.setPercursoEscolhido(percurso1);
        evento1.inscreverParticipantes(participante3, "M");
        participante3.setPercursoEscolhido(percurso1);
        evento1.inscreverParticipantes(participante2, "XG");
        participante2.setPercursoEscolhido(percurso1);
        evento1.inscreverParticipantes(participante1, "P");
        participante1.setPercursoEscolhido(percurso1);

        evento1.definirTempo(participante1, 1500);
        evento1.definirTempo(participante2, 1250);
        evento1.definirTempo(participante3, 1980);
        evento1.definirTempo(participante4, 850);

        System.out.println("");
        System.out.println(evento1.toString());
        System.out.println("");

        org.addEvento(evento1);

        org.getEventos().get(0).criarRanking();

    }
}
