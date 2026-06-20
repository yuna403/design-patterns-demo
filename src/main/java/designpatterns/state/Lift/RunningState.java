package designpatterns.state.Lift;

// 抽象运行状态（可拆分为RunningUpState和RunningDownState）
public abstract class RunningState extends LiftState {
    @Override
    public void open() {
        System.out.println("运行中禁止开门！");
    }

    @Override
    public void close() {
        System.out.println("运行中门已关闭，无需操作");
    }

    @Override
    public void stop() {
        System.out.println("电梯正在减速停止...");
        context.setState(Context.stoppingState); // 切换到停止状态
    }
}