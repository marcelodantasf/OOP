public class Locomotiva{
    /* Uma locomotiva é descrita por um número de série, capacidade de tração e comprimento,
também podendo ser opcionalmente informados durante a sua criação.*/
    private String serial;
    private double comprimento;
    private double tracao;

    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getSerial(){
        return serial;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
    public void setTracao(double tracao){
        this.tracao = tracao;
    }
    
    public double getTracao(){
        return tracao;
    }
    
    public String toString(){
        String str = "";
        str += "Serial: " + this.serial + 
        "\nComprimento: " + this.comprimento + 
        "\nTração: " + this.tracao;
        return str;
    }
    
}

