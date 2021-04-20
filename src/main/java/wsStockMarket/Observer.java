package wsStockMarket;


public interface Observer {
	public void update(Subject o, String a, Double precio);
	public String getName();

}
