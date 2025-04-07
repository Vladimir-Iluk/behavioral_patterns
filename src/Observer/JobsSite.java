package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobsSite implements Observed {
    List<String> vacncies = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addVacncies(String vacancy) {
        this.vacncies.add(vacancy);
        notifyObservers();
    }
    public void removeVacancy(String vacancy) {
        this.vacncies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(this.vacncies);
        }
    }
}
