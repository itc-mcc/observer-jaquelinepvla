package wsStockMarket;

public class StockMarket {

	public void register(Trader t, Stock s) {
		s.registerObservers(t);
	}

	public String trade(Trader t, Stock s, String tipoTransaccion, double precio) {
		t.update(s, tipoTransaccion, precio);
		String TransactionLog = s.notifyObservers(t, tipoTransaccion, precio);
		return TransactionLog;
	}

}