package designpatterns.command.TV;

// 关闭电视命令
public class TVCloseCommand implements Command {
    private Television tv;

    public TVCloseCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}