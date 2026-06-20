package designpatterns.singleton.leton;

//饿汉式（线程安全）
public class HungrySingleton {
    private static final HungrySingleton uniqueInstance = new HungrySingleton();
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return uniqueInstance; // 直接返回预先创建的实例
    }
}
