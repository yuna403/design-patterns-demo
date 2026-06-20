package designpatterns.command.Appliance;

public interface Command {
    void execute();  // 执行命令
    void undo();     // 撤销命令（可选）
}