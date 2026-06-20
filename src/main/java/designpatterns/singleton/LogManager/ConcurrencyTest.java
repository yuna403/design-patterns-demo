package designpatterns.singleton.LogManager;

public class ConcurrencyTest {
    public static void main(String[] args) {
        Runnable logTask = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread " + Thread.currentThread().getId() + " wrote a log");
        };

        // 启动 10 个线程并发写入日志
        for (int i = 0; i < 10; i++) {
            new Thread(logTask).start();
        }
    }
}
