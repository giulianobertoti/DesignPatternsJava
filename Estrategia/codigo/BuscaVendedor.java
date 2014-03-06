import java.util.List;


public class BuscaVendedor implements Busca{
	
	public void imprimirBusca(List produtos){
		if(!produtos.isEmpty()){
			for(Object i : produtos){
				Produto prod = (Produto)i;
				System.out.println("Nome: "+prod.getNome());
				System.out.println("Preco: "+prod.getPreco());
				System.out.println("Prateleira: "+prod.getPrateleira());
				System.out.println("Quantidade: "+prod.getQuantidade());
			}
		} else {
			System.out.println("Nenhum produto encontrado");
		}
		
		
	}

}
