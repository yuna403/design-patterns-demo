package designpatterns.command.Light;

public class Controller {
    private Command[] onCommands = new Command[5];  // 开命令数组
    private Command[] offCommands = new Command[5]; // 关命令数组

    // 设置插槽对应的命令
    public void setCommand(int id, Command onCommand, Command offCommand) {
        if (id < 0 || id >= 5) return;
        onCommands[id] = onCommand;
        offCommands[id] = offCommand;
    }

    // 触发开灯操作
    public void open(int id) {
        if (onCommands[id] != null) {
            onCommands[id].execute();
        }
    }

    // 触发关灯操作
    public void close(int id) {
        if (offCommands[id] != null) {
            offCommands[id].execute();
        }
    }
}
