package src;

/**
 * Created by ASUS on 01.06.2016.
 */
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
