package designpatterns.command.Player;

// 播放命令
public class PlayCommand implements Command {
    private PlayerKernel player;

    public PlayCommand(PlayerKernel player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}