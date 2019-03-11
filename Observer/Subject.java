package Observer;

//抽象主题（被观察者）
public interface Subject {

    //注册观察者
    void registerObserver(Observer observer);

    //删除观察者
    void deleteObserver(Observer observer);

    //通知观察者
    void notifyObserver();

}
