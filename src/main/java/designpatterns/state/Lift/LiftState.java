package designpatterns.state.Lift;

//抽象状态类（LiftState）
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();    // 开门
    public abstract void close();   // 关门
    public abstract void run();     // 运行（上行/下行）
    public abstract void stop();    // 停止
}