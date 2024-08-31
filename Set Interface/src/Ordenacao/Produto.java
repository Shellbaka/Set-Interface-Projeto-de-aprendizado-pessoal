package Ordenacao;
import java.util.Objects;
import java.util.Comparator;


import MétodoSet.PesquisaSet.Contato;

public class Produto implements Comparable<Produto> {
    


    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;



public Produto (String nome, long codigo, double preco, int quantidade) {
this.nome = nome;
this.codigo = codigo;
this.preco = preco;
this.quantidade = quantidade;

}

@Override
public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
}




public String getNome() {
    return nome;
}

public int getQuantidade() {
    return quantidade;
}

public double getPreco (){
return preco;
}

public long getCodigo() {
    return codigo;
}

@Override
public boolean equals(Object o) {
    if(this == o) return true;
    if(!(o instanceof Produto)) return false;
    Produto produto = (Produto) o;
    return Objects.equals(getCodigo(), produto.getCodigo());
}

@Override
public int hashCode() {
    return Objects.hash(getNome());
}



@Override
public String toString() {
    
    return "Código: " + codigo + "\n" +
     "Nome: " + nome + "\n" +
     "Quantidade: " + quantidade + "\n" +
     "Preço: " + preco + "\n" ;
}





}
class ComparatorPorPreco implements Comparator<Produto> {


    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
