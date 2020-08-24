

import java.util.*;

public class Model implements Subject {
	private ArrayList observers;
	private String temperature;
	private String humidity;
	private String pressure;
	
	public Model() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(String temperature, String humidity, String pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public String getTemperature() {
		return temperature;
	}
	
	public String getHumidity() {
		return humidity;
	}
	
	public String getPressure() {
		return pressure;
	}
}
