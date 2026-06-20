package designpatterns.command.Player;

// 停止命令
public class StopCommand implements Command {
    private PlayerKernel player;

    public StopCommand(PlayerKernel player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}