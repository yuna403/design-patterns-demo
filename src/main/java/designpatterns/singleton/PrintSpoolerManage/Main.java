package designpatterns.singleton.PrintSpoolerManage;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        // 正常获取单例实例
        PrintSpoolerSingleton spooler = PrintSpoolerSingleton.getInstance();
        spooler.manageJob("DOC-001", "START"); // 输出：执行操作 [START] 于打印任务: DOC-001

        // 尝试通过反射创建新实例（触发异常）
        try {
            // 获取私有构造函数
            Constructor<PrintSpoolerSingleton> constructor =
                    PrintSpoolerSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true); // 绕过私有权限

            // 尝试创建第二个实例
            PrintSpoolerSingleton illegalSpooler = constructor.newInstance();
            illegalSpooler.manageJob("DOC-002", "CANCEL");
        } catch (Exception e) {
            System.out.println("反射创建实例时抛出异常: " + e.getCause().getMessage());
            // 输出：反射创建实例时抛出异常: 禁止重复创建打印池实例！
        }

        // 验证单例唯一性
        PrintSpoolerSingleton anotherSpooler = PrintSpoolerSingleton.getInstance();
        System.out.println("是否为同一实例: " + (spooler == anotherSpooler)); // 输出：true
    }
}