package Singleton;

/**
 * 懒汉模式
 * @author undestiny
 */
public class LazySingleton {

    public static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
