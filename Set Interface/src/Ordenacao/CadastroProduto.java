package Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProduto {
    
private Set<Produto> produtoSet;


public CadastroProduto () {
    this.produtoSet = new HashSet <>();
}

public void adcionarProduto (String nome, int quantidade, double preco, long codigo) {
produtoSet.add(new Produto(nome, codigo, preco, quantidade));
}

public Set<Produto> exibirProdutosPorNome(){
Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
return produtosPorNome;
}

public Set<Produto> exibirProdutosPorPreco () {
    Set<Produto> produtoPorPreco= new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    
}




}
