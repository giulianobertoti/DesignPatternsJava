package teste;
import controler.NotaFiscalPaulista;
import view.View;
import model.Disco;
import model.Estoque;


public class Teste {
	
	public static void main(String[] args) {
		
		Estoque e = new Estoque();
		e.addDisco(new Disco("Dark Side of the Moon", 1973));
		e.addDisco(new Disco("Abbey Road", 1969));
		
		View v = new View();
		
		e.registerObserver(v);//ligacao do model para view
		
		NotaFiscalPaulista nfp = new NotaFiscalPaulista();
		
		v.setN(nfp); //ligacao da view para controler
		
		nfp.setV(v); // ligacao do controler para view
		
		e.buscarDisco(new Disco("Dark Side of the Moon", 1973));
		
		
		
		
	}

}
