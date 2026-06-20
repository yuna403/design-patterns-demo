package designpatterns.command.Player;

// 暂停命令
public class PauseCommand implements Command {
    private PlayerKernel player;

    public PauseCommand(PlayerKernel player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}