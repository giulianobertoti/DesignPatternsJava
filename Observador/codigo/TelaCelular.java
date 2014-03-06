
public class TelaCelular implements Observer{
	
	public void update(double saldo){
		
		display(saldo);
		
	}
	
	public void display(double s){
		
		System.out.println("Tela do Celular");
		System.out.println("Voce acaba de fazer um saque e seu novo saldo e: "+s);
	}

}
