package strategypattern;

//Encapsulado em uma classe especifica paranao haver duplicacao de codigo  

public class EmprestimoEspecial implements Emprestimo{

	public void emprestar() {
		
		System.out.println("Emprestimo Especial...");
		
	}
	
}
