package designpatterns.state.Lift;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯停止中，开门...");
        context.setState(Context.openningState); // 切换到开门状态
    }

    @Override
    public void close() {
        System.out.println("电梯已停止，门已关闭，无需操作");
    }

    @Override
    public void run() {
        System.out.println("电梯停止中，开始运行...");
        context.setState(Context.runningUpState); // 默认为上行，可扩展为选择方向
    }

    @Override
    public void stop() {
        System.out.println("电梯已停止");
    }
}
