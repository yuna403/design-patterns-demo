package designpatterns.command.Light;

// 关灯命令
public class LampCloseCommand implements Command {
    private Room room;

    public LampCloseCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.closeLamp();
    }
}