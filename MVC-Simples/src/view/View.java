package view;

import java.util.List;

import model.Disco;

import controler.Nota;

public class View implements Observer{
	
	private Nota n;
	private List listaDiscos;
	
	public void setN(Nota nota){
		n = nota;
	}
	
	public void update(List l){
		listaDiscos = l;
		n.emitirNota();
		
	}
	
	public void imprimirDadosDisco(){
		if(!listaDiscos.isEmpty()){
			for(Object i: listaDiscos){
				Disco d = (Disco)i;
				System.out.println(d.getTitulo()+" "+d.getAno());
			}
		}
		
	}
	
	public void imprimirNotaPaulista(){
		System.out.println("Dados da nota Paulista...");
		System.out.println("CPF ....");
	}

}
