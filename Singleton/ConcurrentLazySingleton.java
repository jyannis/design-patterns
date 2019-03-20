package Singleton;

/**
 * 多线程下的懒汉模式
 * @author undestiny
 */
public class ConcurrentLazySingleton {

    public static ConcurrentLazySingleton lazySingleton = null;

    private ConcurrentLazySingleton(){

    }

    //双重检查加锁
    public static ConcurrentLazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (ConcurrentLazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new ConcurrentLazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
