package designpatterns.singleton.leton;

//懒汉式（线程不安全）
public class LazySingleton {
    private static LazySingleton uniqueInstance;
    private LazySingleton() {} // 私有构造方法

    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton(); // 延迟初始化
        }
        return uniqueInstance;
    }
}
