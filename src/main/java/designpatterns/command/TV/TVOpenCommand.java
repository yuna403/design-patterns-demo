package designpatterns.command.TV;

// 打开电视命令
public class TVOpenCommand implements Command {
    private Television tv;

    public TVOpenCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }
}