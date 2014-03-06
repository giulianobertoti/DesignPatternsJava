
public class Teste {
	
	public static void main(String[] args) {
		
		
		Funcionario joao = new Funcionario();
		joao.setB(new BuscaEstoquista());
		
		Estoque e = new Estoque(joao);
		inicializarEstoque(e);
		
		
		e.buscar(new Produto("Roda", 0.0, "", 0, new Matches1()));
		
		joao.setB(new BuscaVendedor());
		
		System.out.println("-----------------------------");
		
		
		e.buscar(new Produto("Roda", 0.0, "", 0, new Matches2()));
		
	}
	
	public static void inicializarEstoque(Estoque est){
		est.addProduto(new Produto("Roda", 400.0, "ABC345", 90));
		est.addProduto(new Produto("Roda", 500.0, "CDB667", 10));
		est.addProduto(new Produto("Pneu", 200.0, "DDR55", 45));
	}

}
