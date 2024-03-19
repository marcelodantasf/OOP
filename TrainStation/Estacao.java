public class Estacao{
    /*Uma estação ferroviária tem
uma sigla e uma descrição. */
private String sigla;
private String desc;


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

public String toString(){
    String str = "";
    str += "Sigla: " + this.sigla + 
    "\nDescrição: " + this.desc;
    return str;
}

}

