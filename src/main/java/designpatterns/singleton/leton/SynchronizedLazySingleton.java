package designpatterns.singleton.leton;

//加锁懒汉式（线程安全）
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton uniqueInstance;
    private SynchronizedLazySingleton() {}

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedLazySingleton();
        }
        return uniqueInstance;
    }
}