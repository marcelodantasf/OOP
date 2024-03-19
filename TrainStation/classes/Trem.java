import java.util.Date;

public class Trem{
    /*Um trem é descrito por
um prefixo (ex: NAG1010) e data de formação. Um trem é formado em uma estação ferroviária de
origem e tem como destino uma outra estação ferroviária, ou seja, a estação de origem não pode
ser igual à estação de destino (também deve ser informado durante a criação). Um trem não pode
ter mais do que 150 recursos (vagões e locomotivas).*/
    private String prefixo;
    private Date dataFormacao;
    private Estacao originStation;
    private Estacao destinationStation;
    private int qtdRecursos;
    private ArrayList <RecursosFerroviarios> resources = new ArrayList <>();

    public void setPrefixo(String compEngates){
        this.compEngates = compEngates;
    }

    public String getPrefixo(){
        return prefixo;
    }

    public void setDataFormacao(Date dataFormacao){
        this.dataFormacao = dataFormacao;
    }

    public Date getDataFormacao(){
        return dataFormacao;
    }

    public void setEstacaoOrigem(Estacao originStation){
        this.originStation = originStation;
    }

    public Estacao getEstacaoOrigem(){
        return originStation;
    }

    public void setEstacaoDestino(Estacao destinationStation){
        this.destinationStation = destinationStation;
    }

    public Estacao getEstacaoDestino(){
        return destinationStation;
    }

    public void setQtdRecursos(int qtdRecursos){
        this.qtdRecursos = qtdRecursos;
    }

    public int getQtdRecursos (){
        return qtdRecursos;
    }

    public void addRecursos(RecursosFerroviarios recurso){
        if (qtdRecursos<150){
            resources.add(recurso);
            qtdRecursos++;
            System.out.println("Recurso adicionado com sucesso!\n");
        } else {
            System.out.println("Número de elementos esgotado\n");
        }
    }

    public String toString(){
        String str = "";
        str += "Prefixo do trem: " + this.prefixo + 
        "\nTipo do vagão: " + this.tipo + 
        "\nCapacidade de carga: " + this.capacidadeCarga +
        "\nComprimento das testeiras: " + this.compTesteiras +
        "\nComprimento dos engates: " + this.compEngates +
        "\nEstação de origem: " + this.originStation +
         "\nEstação de destino: " + this.destinationStation +
        "\nQuantidade de recursos ferroviários: " + this.qtdRecursos;
        return str;
    }

}