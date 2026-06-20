package designpatterns.command.Appliance;

// 通用“关闭”命令
public class TurnOffCommand implements Command {
    private Appliance appliance;

    public TurnOffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.off();
    }

    @Override
    public void undo() {
        appliance.on(); // 撤销关闭即开启
    }
}