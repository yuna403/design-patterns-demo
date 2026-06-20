package designpatterns.command.Player;

// 拖拽进度条命令
public class SeekCommand implements Command {
    private PlayerKernel player;
    private int position;

    public SeekCommand(PlayerKernel player, int position) {
        this.player = player;
        this.position = position;
    }

    @Override
    public void execute() {
        player.seek(position);
    }
}