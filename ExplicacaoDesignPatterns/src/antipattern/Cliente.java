package antipattern;

//Comportamento de pedir emprestimo: Empresa e o Aposentado tem condicoes especiais

//Qual eh o problema??????
//O problema eh que o emprestimo sem condicoes especiais esta sendo
//duplicado nas classes Estudante e Correntista

//Lembrando que quando eu colocar mais comportamentos, mais problemas ainda
//acontecerao

//Conclusao: Heranca eh um anti pattern


public abstract class Cliente {
	
	private String nome;
	//etc...
	
	
	//emprestar com condicoes especiais
	public void emprestar() {
		
	}

}
