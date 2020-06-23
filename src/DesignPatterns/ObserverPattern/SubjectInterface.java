package DesignPatterns.ObserverPattern;
// This is the object whose changes we have to observe
//Observers monitor subjects by registering to them through an interface

public interface SubjectInterface {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
