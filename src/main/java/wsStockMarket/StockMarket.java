package wsStockMarket;

public class StockMarket {
	
	public StockMarket() {

	}
	public void register(Trader t, Stock s) {
		s.registerObserver(t);
	}

	public String trade(Trader t, Stock s, String operacion, double precio) {
		t.update(s,operacion,precio);
		return s.notifyObservers(t, operacion, precio);
	}
    
}