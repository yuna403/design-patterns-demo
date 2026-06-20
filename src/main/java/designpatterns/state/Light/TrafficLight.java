package designpatterns.state.Light;

public class TrafficLight {
    private State currentState;

    // 初始化状态为红灯
    public TrafficLight() {
        this.currentState = new RedLightState();
    }

    // 设置当前状态，并通知状态对象关联上下文
    public void setState(State state) {
        this.currentState = state;
        currentState.displaySignal(); // 切换状态时立即显示新状态
    }

    // 触发状态切换
    public void changeSignal() {
        currentState.handleSignalChange(this);
    }
}