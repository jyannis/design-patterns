package Singleton;

/**
 * 饿汉模式
 * @author undestiny
 */
public class EagerSingleton {

    public static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

}
