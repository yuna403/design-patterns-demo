package designpatterns.singleton.leton;

//双重检查加锁懒汉式（线程安全，高性能）

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton uniqueInstance;
    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) { // 第一次检查
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) { // 第二次检查
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}