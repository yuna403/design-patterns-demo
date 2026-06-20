package designpatterns.state.Light;

public class GreenLightState implements State {
    @Override
    public void displaySignal() {
        System.out.println("🟢 绿灯亮起：允许车辆通行，禁止行人通过");
    }

    @Override
    public void handleSignalChange(TrafficLight context) {
        System.out.println("🚦 绿灯切换为黄灯");
        context.setState(new YellowLightState()); // 切换到黄灯状态
    }
}