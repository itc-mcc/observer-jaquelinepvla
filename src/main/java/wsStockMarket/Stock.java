package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
	String tipo; // Nombre del stock
	StockMarket mercado_acciones;
	ArrayList<Observer> observers;
	double precio;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		this.mercado_acciones = mercado_acciones;
		this.precio = precio_inicial;
		this.tipo = tipo;
		observers = new ArrayList<>();
	}

	@Override
	public void registerObservers(Observer o) {
		observers.add(o);
	}

	@Override
	public String notifyObservers(Observer trader, String tipoTransaccion, Double precio) {
		String transaccion="";
		if (trader instanceof Trader) {
			for (Observer observer : observers) {
				transaccion += observer.getName() + ":The latest trade is Trader:"+ trader.getName()+" "+ tipoTransaccion
						+" $"+precio+ " Stock: "+ this.tipo+"\n";
			}
		}
		return transaccion.substring(0,transaccion.length()- 1);
	}
}