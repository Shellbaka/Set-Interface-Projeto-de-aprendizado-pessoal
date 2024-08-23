package MétodoSet;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    
private Set<Convidado> convidadoSet;


public ConjuntoConvidados () {
    this.convidadoSet = new HashSet<>();
}


public void adcionarUmConvidadoNoSet(String name, int codigoConvidado) {
convidadoSet.add(new Convidado(name, codigoConvidado));
}


public void removerCodigoConvite(int codigoConvidado) {
Convidado convidadoParaRemover = null;
for(Convidado c : convidadoSet) {
    if(c.getCodigoConvidado() == codigoConvidado) {
        convidadoParaRemover = c;
        break;
    }
}
convidadoSet.remove(convidadoParaRemover);


}


public int contarConvidados(){
    return convidadoSet.size();
}

public void exibirConvidados() {
    System.out.println(convidadoSet);
}



}
