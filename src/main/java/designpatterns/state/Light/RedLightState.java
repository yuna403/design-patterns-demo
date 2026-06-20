package designpatterns.state.Light;

public class RedLightState implements State {
    @Override
    public void displaySignal() {
        System.out.println("🔴 红灯亮起：禁止车辆通行，允许行人通过");
    }

    @Override
    public void handleSignalChange(TrafficLight context) {
        System.out.println("🚦 红灯切换为绿灯");
        context.setState(new GreenLightState()); // 切换到绿灯状态
    }
}