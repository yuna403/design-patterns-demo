package designpatterns.command.Light;

// 开灯命令
public class LampOpenCommand implements Command {
    private Room room;

    public LampOpenCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.openLamp();
    }
}
