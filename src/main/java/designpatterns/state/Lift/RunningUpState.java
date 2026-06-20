package designpatterns.state.Lift;

// 上行运行状态
public class RunningUpState extends RunningState {
    @Override
    public void run() {
        System.out.println("电梯正在上行...");
    }
}