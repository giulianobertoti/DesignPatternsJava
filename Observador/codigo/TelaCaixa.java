
public class TelaCaixa implements Observer{
	
	public void update(double saldo){
		
		display(saldo);
		
	}
	
	public void display(double s){
		
		System.out.println("Tela do Caixa Eletronico");
		System.out.println("Seu novo saldo e: "+s);
	}

}
