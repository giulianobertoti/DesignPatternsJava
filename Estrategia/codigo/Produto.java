
public class Produto {
	
	private String nome;
	private double preco;
	private String prateleira;
	private int quantidade;
	private Matches matches;
	
	public Produto(String n, double p, String prat, int quant){
		nome = n;
		preco = p;
		prateleira = prat;
		quantidade = quant;
	}
	
	public Produto(String n, double p, String prat, int quant, Matches m){
		nome = n;
		preco = p;
		prateleira = prat;
		quantidade = quant;
		matches = m;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public String getPrateleira(){
		return prateleira;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setMatches(Matches m){
		matches = m;
	}
	
	public boolean matches(Produto p){
		if(matches.matches(p, this)) return true;
		return false;
		
	}

}
