package wsStockMarket;

import java.util.HashMap;
import java.util.Map;

public class Trader implements Observer {
	private String nombre;
	private Map<Stock, Double> stocks; 
	StockMarket mercado_acciones;

	public Trader(String nombre, StockMarket mercado_acciones) {
		this.nombre = nombre;
		this.stocks=new HashMap<>();
		this.mercado_acciones = mercado_acciones;
	}

	public void update(Subject subj, String operacion, Double precio) {
		if(subj instanceof Stock){
			Stock s = (Stock) subj;
			if (operacion.equals("buy")){
				this.stocks.put(s, precio);

			}

			if(operacion.equals("sell")){
				this.stocks.remove(s);

			}
		}

		}
	public String getName(){
		return this.nombre; 
	}
	
		
	}
    
