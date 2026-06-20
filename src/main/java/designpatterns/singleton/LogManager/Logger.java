package designpatterns.singleton.LogManager;

//（双重检查加锁懒汉式）
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    // 静态变量：volatile 确保可见性，防止指令重排序
    private static volatile Logger instance;
    private FileWriter logFile;

    // 私有构造方法，初始化日志文件
    private Logger() {
        try {
            logFile = new FileWriter("app.log", true); // 追加模式
        } catch (IOException e) {
            System.err.println("Failed to initialize log file: " + e.getMessage());
        }
    }

    // 全局访问点：双重检查锁定
    public static Logger getInstance() {
        if (instance == null) { // 第一次检查，避免不必要的锁竞争
            synchronized (Logger.class) {
                if (instance == null) { // 第二次检查，确保线程安全
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // 记录日志的方法
    public void log(String message) {
        String timestamp = LocalDateTime.now().toString();
        try {
            logFile.write("[" + timestamp + "] " + message + "\n");
            logFile.flush(); // 立即写入文件
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }

    // 关闭日志文件
    public void close() {
        try {
            logFile.close();
        } catch (IOException e) {
            System.err.println("Failed to close log file: " + e.getMessage());
        }
    }
}
