package model;
import java.util.List;
import java.util.LinkedList;

import view.Observer;

public class Estoque implements Subject{
	
	private List discos;
	private List observers;
	
	public Estoque(){
		discos = new LinkedList();
		observers = new LinkedList();
	}
	
	
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	
	public void notifyObservers(List encontrados){
		for(Object i: observers){
			Observer ob = (Observer)i;
			ob.update(encontrados);
		}
	}
	
	public void addDisco(Disco d){
		discos.add(d);
	}
	
	public void buscarDisco(Disco d){
		List encontrados = new LinkedList();
		for(Object i: discos){
			Disco discoEstoque = (Disco)i;
			if(discoEstoque.matches(d)) encontrados.add(discoEstoque);
		}
		notifyObservers(encontrados);
	}

}
