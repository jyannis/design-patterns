package Observer.Implementation;

import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;
import java.util.List;

//具体主题
public class Teacher implements Subject{

    //通知信息
    private String notice;

    //观察者列表
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        if(observers==null)return;
        for(Observer observer:observers){
            observer.update(notice);
        }
    }

    public void setNotice(String notice) {
        this.notice = notice;
        System.out.println("老师发的新通知是：" + notice);
    }
}
