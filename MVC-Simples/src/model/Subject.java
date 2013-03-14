package model;

import java.util.List;

import view.Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void notifyObservers(List encontrados);

}
