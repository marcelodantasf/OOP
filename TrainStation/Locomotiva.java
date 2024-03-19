public class Locomotiva{
    /* Uma locomotiva é descrita por um número de série, capacidade de tração e comprimento,
também podendo ser opcionalmente informados durante a sua criação.*/
    private String serial;
    private float comprimento;
    private float tracao;

    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getSerial(){
        return serial;
    }
    
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    
    public float getComprimento(){
        return comprimento;
    }
    
    public void setTracao(float tracao){
        this.tracao = tracao;
    }
    
    public float getTracao(){
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

