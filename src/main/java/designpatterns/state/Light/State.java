package designpatterns.state.Light;

public interface State {
    // 显示当前信号灯状态
    void displaySignal();
    // 处理状态切换逻辑
    void handleSignalChange(TrafficLight context);
}