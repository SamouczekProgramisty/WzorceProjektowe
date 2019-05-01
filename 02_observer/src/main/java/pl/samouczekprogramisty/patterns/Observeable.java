package pl.samouczekprogramisty.patterns;

public interface Observeable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
