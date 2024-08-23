package MétodoSet.PesquisaSet;
import java.util.Set;
import java.util.HashSet;

public class agendaContatos {
    
private Set<Contato> contatoSet;

public agendaContatos() {
    this.contatoSet = new HashSet<>();
}

public void adcionarContato(String nome, int numero) {
    contatoSet.add(new Contato( nome, numero));
}

public void exibirContato() {
    System.out.println(contatoSet);
}


public Set<Contato> pesquisarPorNome(String nome) {
Set<Contato> contatosPorNome = new HashSet<>();
for(Contato c : contatoSet) {
    if(c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
    }
}
return contatosPorNome;
}


public Contato atualizarNumeroContato(String nome, int novoNumero) {
Contato contatoAtualizado = null;
for(Contato c : contatoSet) {
    if(c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
    }
}
return contatoAtualizado;
}



}
