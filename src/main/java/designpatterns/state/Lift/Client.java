package designpatterns.state.Lift;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.stoppingState); // 初始状态：停止

        // 模拟状态流程：停止 → 开门 → 关门 → 运行 → 停止
        context.open();    // 停止状态开门
        context.close();   // 开门状态关门
        context.run();     // 关门状态运行（上行）
        context.stop();    // 运行状态停止
    }
}