import java.util.ArrayList;

public class Organizador extends Pessoa {
    ArrayList<Evento> eventosOrganizados = new ArrayList<Evento>();

    public Organizador (String nome, String cpf, String dataNascimento, String endereco){
        super(nome, cpf, dataNascimento, endereco);
    }
}