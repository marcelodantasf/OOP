import java.util.ArrayList;

public class Estacao{
        /*Uma estação ferroviária tem
    uma sigla e uma descrição. */
    private String sigla;
    private String desc;
    private ArrayList <Linhas> linhas = new ArrayList <Linhas>();


    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public String getSigla(){
        return sigla;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public void setLinhas(ArrayList <Linhas> linhas){
        this.linhas = linhas;
    }

    public ArrayList <Linhas> getLinhas(){
        return linhas;
    }

    public void addLinha(Linhas linha){
        linhas.add(linha);
        System.out.println("Linha adicionada com sucesso!");
    }

    public String toString(){
        String str = "";
        str += "Sigla: " + this.sigla + 
        "\nDescrição: " + this.desc;
        return str;
    }

}

