package designpatterns.command.TV;

// 切换频道命令
public class TVChangeCommand implements Command {
    private Television tv;

    public TVChangeCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
