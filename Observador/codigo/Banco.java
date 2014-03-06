import java.util.ArrayList;


public class Banco implements Subject{
	
	private ArrayList observers;
	private Cliente c;
	
	public Banco(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double novoSaldo){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoSaldo);
		}
	}
	
	public double sacar(Cliente c, double valor){
		
		c.saldo = c.saldo - valor;
		
		notifyObservers(c.saldo);
		return c.saldo;
		
	}

}
