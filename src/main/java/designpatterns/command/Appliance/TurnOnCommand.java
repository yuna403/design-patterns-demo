package designpatterns.command.Appliance;

// 通用“开启”命令
public class TurnOnCommand implements Command {
    private Appliance appliance;

    public TurnOnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.on();
    }

    @Override
    public void undo() {
        appliance.off(); // 撤销开启即关闭
    }
}