interface Subject {
    //methods to register and unregister observers
    void register(Observer observer);

    void unregister(Observer observer);

    //method to notify observers of change
    void notifyObserver();

    //method to get updates from subject
    Object getUpdate(Observer observer);
}
