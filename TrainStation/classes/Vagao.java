public class Vagao {
    /* Um vagão é descrito por
um número de série, tipo, capacidade de carga, comprimento entre testeiras e comprimento dos
engates, podendo ser opcionalmente informados durante a sua criação.
*/
private String serial;
private String tipo;
private double capacidadeCarga;
private double compTesteiras;
private double compEngates;

public void setSerial(String serial){
    this.serial = serial;
}

public String getSerial(){
    return serial;
}

public void setTipo(String tipo){
    this.tipo = tipo;
}

public String getTipo(){
    return tipo;
}

public void setCapacidadeCarga(double carga){
    this.capacidadecarga = capacidadeCarga;
}

public double getCapacidadeCarga(){
    return capacidadeCarga;
}

public void setCompTesteiras(double compTesteiras){
    this.compTesteiras = compTesteiras;
}

public double getCompTesteiras(){
    return compTesteiras;
}

public void setCompEngates(double compEngates){
    this.compEngates = compEngates;
}

public double getCompEngates(){
    return compEngates;
}

public String toString(){
        String str = "";
        str += "Número de série: " + this.serial + 
        "\nTipo do vagão: " + this.tipo + 
        "\nCapacidade de carga: " + this.capacidadeCarga +
        "\nComprimento das testeiras: " + this.compTesteiras +
        "\nComprimento dos engates: " + this.compEngates;
        return str;
    }

}