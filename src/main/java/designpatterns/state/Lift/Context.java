package designpatterns.state.Lift;

public class Context {
    // 单例状态实例
    public static final LiftState stoppingState = new StoppingState();
    public static final LiftState openningState = new OpenningState();
    public static final LiftState closingState = new ClosingState();
    public static final LiftState runningUpState = new RunningUpState();

    private LiftState currentState;

    public void setState(LiftState state) {
        this.currentState = state;
        currentState.setContext(this); // 通知状态类当前环境
    }

    // 委托给当前状态处理
    public void open() {
        currentState.open();
    }

    public void close() {
        currentState.close();
    }

    public void run() {
        currentState.run();
    }

    public void stop() {
        currentState.stop();
    }
}