

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public void setMeasurements(String temperature, String humidity, String pressure);
}
