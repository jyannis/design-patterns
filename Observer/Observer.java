package Observer;

//抽象观察者
public interface Observer {

    //更新状态（接收被观察者通知的新消息）
    void update(String notice);

}
