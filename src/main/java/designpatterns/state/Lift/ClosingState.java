package designpatterns.state.Lift;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门重新打开...");
        context.setState(Context.openningState); // 切换到开门状态
    }

    @Override
    public void close() {
        System.out.println("电梯门已关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯门已关闭，开始运行...");
        context.setState(Context.runningUpState); // 切换到运行状态
    }

    @Override
    public void stop() {
        System.out.println("电梯处于关门状态，先运行或开门");
    }
}