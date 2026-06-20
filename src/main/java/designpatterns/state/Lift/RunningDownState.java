package designpatterns.state.Lift;

// 下行运行状态（可选扩展）
public class RunningDownState extends RunningState {
    @Override
    public void run() {
        System.out.println("电梯正在下行...");
    }
}