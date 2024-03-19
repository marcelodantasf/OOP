public class Linhas{
    /* Uma linha ferroviária tem um número (que a diferencia de outra linha
dentro da mesma estação), uma extensão em metros e uma descrição*/
    private int numero;
    private double extensao;
    private String desc;
    private ArrayList <RecursosFerroviarios> resources = new ArrayList <>();
    private RecursosFerroviarios vagao;
    private RecursosFerroviarios trem;
    private RecursosFerroviarios locomotiva;
    
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setExtensao(double extensao){
        this.extensao = extensao;
    }

    public double getExtensao(){
        return extensao;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public void setResources(ArrayList <RecursosFerroviarios> resources){
        this.resources = resources;
    }

    public ArrayList <RecursosFerroviarios> getResources(){
        return resources;
    }

    public void addRecursos(RecursosFerroviarios recurso){
        this.resources.add(recurso);
        System.out.println("Recurso adicionado com sucesso!");
    }

    public String toString(){
        String str = "";
        str += "Número da linha: " + this.numero + 
        "\nExtensão: " + this.extensao + 
        "\nDescrição: " + this.desc +
        "\nQuantidade de recursos ferroviários: " + this.resources.size();
        return str;
    }
}