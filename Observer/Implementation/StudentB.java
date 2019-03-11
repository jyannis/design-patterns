package Observer.Implementation;

import Observer.Observer;
import Observer.Display;
import Observer.Subject;

//具体观察者B
public class StudentB  implements Observer, Display {

    private String notice;
    private Subject subject;

    public StudentB(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String notice) {
        this.notice = notice;
        display();
    }

    public void display() {
        System.out.println("学生B收到的新通知是：" + notice);
    }
}
