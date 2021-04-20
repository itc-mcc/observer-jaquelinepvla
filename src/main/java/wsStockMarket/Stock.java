package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
	private ArrayList<Observer> observers;
	private String tipo;
	StockMarket mercado_acciones;
	Double precio_inicial;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		this.tipo = tipo;
		this.mercado_acciones = mercado_acciones;
		this.precio_inicial = precio_inicial;
		observers=new ArrayList<>();

	}
	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	public String notifyObservers(Observer trader, String operacion, Double precio) { 
		String trans = "";
		if(trader instanceof Trader){
			for(Observer o: observers){
				trans = trans + o.getName() + ":The latest trade is Trader:"+ trader.getName()+" "+ operacion +" $" + precio + " Stock: "+ this.tipo+"\n";
			}

		}
		trans = trans.substring(0,trans.length()- 1); 
		return trans;
		
	}
	
}