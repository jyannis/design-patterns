package Observer;

import Observer.Implementation.StudentA;
import Observer.Implementation.StudentB;
import Observer.Implementation.Teacher;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        StudentA studentA = new StudentA(teacher);
        StudentB studentB = new StudentB(teacher);
        teacher.setNotice("请大家后天早上提交作业");
        teacher.notifyObserver();
    }

}
