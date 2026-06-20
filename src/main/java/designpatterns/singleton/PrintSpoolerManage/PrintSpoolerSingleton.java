package designpatterns.singleton.PrintSpoolerManage;

public class PrintSpoolerSingleton {
    // 静态变量保存唯一实例，volatile确保可见性
    private static volatile PrintSpoolerSingleton instance;

    // 私有构造方法，防止外部实例化
    private PrintSpoolerSingleton() {
        // 防止通过反射创建新实例
        if (instance != null) {
            throw new RuntimeException("禁止重复创建打印池实例！");
        }
    }

    // 全局访问点：双重检查锁定
    public static PrintSpoolerSingleton getInstance() {
        if (instance == null) { // 第一次检查避免不必要的锁竞争
            synchronized (PrintSpoolerSingleton.class) {
                if (instance == null) { // 第二次检查确保线程安全
                    instance = new PrintSpoolerSingleton();
                }
            }
        }
        return instance;
    }

    // 示例方法：管理打印任务
    public void manageJob(String jobId, String action) {
        System.out.println("执行操作 [" + action + "] 于打印任务: " + jobId);
    }
}