package MétodoSet;

public class Convidado {
    
    private String name;

    private int codigoConvidado;

    public Convidado(String name, int codigoConvidado){
      this.name = name;
      this.codigoConvidado = codigoConvidado;

    }


    public String getName() {
        return name;
    }

public int getCodigoConvidado() {
    return codigoConvidado;

}

@Override
public String toString() {
    
    return "Nome= " + name + "\n" +
            "Código de convidado= " + codigoConvidado + "\n" ;
}



}
