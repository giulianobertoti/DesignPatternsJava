
public class Teste {

	public static void main(String[] args) {
		
		Banco b = new Banco();
		TelaCaixa tela = new TelaCaixa();
		TelaCelular cel = new TelaCelular();
		b.registerObserver(tela);
		b.registerObserver(cel);
		
		Cliente marilia = new Cliente(500.0, "76767A", "njvd98078");
		
		marilia.saldo = b.sacar(marilia, 200.0);
		
		
		
		
	}
}
