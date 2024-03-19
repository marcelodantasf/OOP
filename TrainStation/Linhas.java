public class Linhas{
    /* Uma linha ferroviária tem um número (que a diferencia de outra linha
dentro da mesma estação), uma extensão em metros e uma descrição*/
    private int numero;
    private float extensao;
    private String desc;

    
public void setNumero(int numero){
    this.numero = numero;
}

public int getNumero(){
    return numero;
}

public void setExtensao(float extensao){
    this.extensao = extensao;
}

public float getExtensao(){
    return extensao;
}

public void setDesc(String desc){
    this.desc = desc;
}

public String getDesc(){
    return desc;
}

public String toString(){
    String str = "";
    str += "Número da linha: " + this.numero + 
    "\nExtensão: " + this.extensao + 
    "\nDescrição: " + this.desc;
    return str;
}
}
