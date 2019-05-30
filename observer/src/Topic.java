import java.util.ArrayList;
import java.util.List;

class Topic implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        List<Observer> localObservers = null;
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            localObservers = new ArrayList<>(this.observers);
            this.changed = false;
            for (Observer observer : localObservers) {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message Posted To Topic : " + msg);
        this.message = msg;
        this.changed = true;
        notifyObserver();
    }
}
