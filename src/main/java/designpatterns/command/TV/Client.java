package designpatterns.command.TV;

// 客户端测试
public class Client {
    public static void main(String[] args) {
        Television tv = new Television();

        // 创建命令对象
        Command openCmd = new TVOpenCommand(tv);
        Command closeCmd = new TVCloseCommand(tv);
        Command changeCmd = new TVChangeCommand(tv);

        // 配置遥控器
        Controller remote = new Controller(openCmd, closeCmd, changeCmd);

        // 模拟用户操作
        remote.open();     // 输出：电视机已打开
        remote.change();  // 输出：切换频道
        remote.close();   // 输出：电视机已关闭
    }
}