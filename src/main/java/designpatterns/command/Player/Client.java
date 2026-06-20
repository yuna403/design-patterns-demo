package designpatterns.command.Player;

// 客户端测试
public class Client {
    public static void main(String[] args) {
        // 创建播放器内核（接收者）
        PlayerKernel player = new PlayerKernel();

        // 创建命令对象
        Command playCmd = new PlayCommand(player);
        Command stopCmd = new StopCommand(player);
        Command pauseCmd = new PauseCommand(player);
        Command seekCmd = new SeekCommand(player, 50); // 拖拽到50%进度

        // 配置控制器（调用者）
        Controller controller = new Controller();
        controller.setPlayCommand(playCmd);
        controller.setStopCommand(stopCmd);
        controller.setPauseCommand(pauseCmd);
        controller.setSeekCommand(seekCmd);

        // 模拟用户操作
        controller.pressPlayButton();  // 输出：播放器开始播放...
        controller.pressPauseButton(); // 输出：播放器暂停
        controller.pressSeekButton();  // 输出：跳转到进度：50%
        controller.pressStopButton();  // 输出：播放器停止播放
    }
}
