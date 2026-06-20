package designpatterns.state.Lift;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门已打开，请勿重复操作");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
        context.setState(Context.closingState); // 切换到关门状态
    }

    @Override
    public void run() {
        System.out.println("门未关闭，无法运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯处于开门状态，先关闭门");
    }
}