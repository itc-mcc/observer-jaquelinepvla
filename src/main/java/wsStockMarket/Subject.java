package wsStockMarket;

public interface Subject {
    void registerObservers(Observer o);
    String notifyObservers(Observer t, String tipoTransaccion, Double precio);
}