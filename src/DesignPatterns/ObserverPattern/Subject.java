package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

class Subject implements  SubjectInterface {
    List<Observer>observerList = new ArrayList<Observer>();
    private  int flag;

    public  int getFlag(){
        return  flag;
    }

    public void setFlag(int flag){
        this.flag = flag;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0;i<observerList.size();i++){
            observerList.get(i).update();
        }

    }
}
