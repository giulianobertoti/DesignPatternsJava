package controler;

import model.Estoque;
import view.View;

public class SemNotaPaulista implements Nota{
	
	private View v;
	private Estoque e;
	
	public void setV(View view){
		v = view;
	}
	
	public void emitirNota(){
		v.imprimirDadosDisco();
	}

}
