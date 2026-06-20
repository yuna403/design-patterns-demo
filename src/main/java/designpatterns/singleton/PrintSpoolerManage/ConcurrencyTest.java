package designpatterns.singleton.PrintSpoolerManage;

public class ConcurrencyTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            // 添加随机延迟，模拟实际并发场景
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            PrintSpoolerSingleton spooler = PrintSpoolerSingleton.getInstance();
            System.out.println("线程 " + Thread.currentThread().getId() + " 实例哈希值: " + spooler.hashCode());
        };

        // 启动 10 个线程并发获取实例
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}