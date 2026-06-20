package designpatterns.command.Appliance;

import java.util.HashMap;
import java.util.Stack;

public class RemoteApp {
    private HashMap<String, Command> commands = new HashMap<>();  // 使用完整接口名
    private Stack<Command> history = new Stack<>();

    public void addCommand(String name, Command cmd) {
        commands.put(name, cmd);
    }

    public void pressButton(String name) {
        Command cmd = commands.get(name);
        if (cmd != null) {
            cmd.execute();
            history.push(cmd);
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCmd = history.pop();
            lastCmd.undo();
        }
    }
}