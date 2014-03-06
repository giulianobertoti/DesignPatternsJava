
public class Matches1 implements Matches{

	public boolean matches(Produto prod1, Produto prod2){
		if(!prod1.getPrateleira().equals(prod2.getPrateleira())) return false;
		return true;
	}
	
}
