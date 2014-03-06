import java.util.List;
import java.util.LinkedList;

public class Estoque {
	
	private List<Produto> lista;
	
	private Funcionario func;
	
	public Estoque(Funcionario f){
		lista = new LinkedList<Produto>();
		func = f;
	}
	
	public void addProduto(Produto p){
		lista.add(p);
	}
	
	public void buscar(Produto p){
		List l = new LinkedList();
		for(Object i : lista){
			Produto prod = (Produto)i;
			if(p.matches(prod)) l.add(prod); //aqui a ordem teve que ser invertida, ou seja, tive que chamar o matches de p, que eh passado como argumento e tem o atributo matches setado, e nao chamar o matches de prod, que eh o produto do estoque e nao tem o matches setado - pois se o matches de prod fosse chamado, daria NullPointer
		}
		func.realizarImpressao(l);
		
	}

}
