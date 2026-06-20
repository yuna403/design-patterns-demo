package designpatterns.singleton.leton;

public class Main {
    public static void main(String[] args) {
        // 验证单例实例是否唯一
        Runnable task = () -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println("LazySingleton HashCode: " + instance.hashCode());
        };

        // 多线程测试懒汉式的线程不安全问题
        new Thread(task).start();
        new Thread(task).start();
    }
}
