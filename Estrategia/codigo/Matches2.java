
public class Matches2 implements Matches{

	public boolean matches(Produto prod1, Produto prod2){
		if(!prod1.getNome().equals(prod2.getNome())) return false;
		return true;
	}
	
}
