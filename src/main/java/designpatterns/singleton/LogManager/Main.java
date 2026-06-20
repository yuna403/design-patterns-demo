package designpatterns.singleton.LogManager;

public class Main {
    public static void main(String[] args) {
        // 获取日志实例
        Logger logger = Logger.getInstance();

        // 记录不同模块的日志
        logger.log("Application started");
        logger.log("User 'admin' logged in");
        logger.log("Error: Database connection failed");

        // 关闭日志文件（通常在程序退出时调用）
        logger.close();

        // 验证单例唯一性
        Logger anotherLogger = Logger.getInstance();
        System.out.println("Is same instance? " + (logger == anotherLogger)); // 输出 true
    }
}
