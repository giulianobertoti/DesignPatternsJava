package model;

public class Disco {
	
	private String titulo;
	private int ano;
	
	public Disco(String t, int a){
		titulo = t;
		ano = a;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getAno(){
		return ano;
	}
	
	public boolean matches(Disco d){
		if(!titulo.equals(d.titulo)) return false;
		if(ano!=d.ano) return false;
		return true;
	}

}
