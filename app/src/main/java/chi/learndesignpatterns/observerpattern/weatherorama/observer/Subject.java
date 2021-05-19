package chi.learndesignpatterns.observerpattern.weatherorama.observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
