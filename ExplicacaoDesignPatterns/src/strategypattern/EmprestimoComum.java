package strategypattern;

//Encapsulado em uma classe especifica paranao haver duplicacao de codigo  

public class EmprestimoComum implements Emprestimo{

	public void emprestar() {
		
		System.out.println("Emprestimo Comum...");
		
	}
	
}
