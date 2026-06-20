package designpatterns.command.Light;

// 客户端测试
public class Client {
    public static void main(String[] args) {
        // 创建五个房间
        Room livingRoom = new Room("客厅");
        Room kitchen = new Room("厨房");
        Room bedroom = new Room("卧室");
        Room bathroom = new Room("浴室");
        Room garage = new Room("车库");

        // 创建遥控器并配置插槽命令
        Controller remote = new Controller();
        remote.setCommand(0, new LampOpenCommand(livingRoom), new LampCloseCommand(livingRoom));
        remote.setCommand(1, new LampOpenCommand(kitchen), new LampCloseCommand(kitchen));
        remote.setCommand(2, new LampOpenCommand(bedroom), new LampCloseCommand(bedroom));
        remote.setCommand(3, new LampOpenCommand(bathroom), new LampCloseCommand(bathroom));
        remote.setCommand(4, new LampOpenCommand(garage), new LampCloseCommand(garage));

        // 模拟用户操作
        remote.open(0);  // 输出：客厅的灯已打开
        remote.close(0); // 输出：客厅的灯已关闭
        remote.open(1);  // 输出：厨房的灯已打开
    }
}
