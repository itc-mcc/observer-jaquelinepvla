package wsStockMarket;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public String notifyObservers(Observer trader, String Opercacion, Double precio);

}
