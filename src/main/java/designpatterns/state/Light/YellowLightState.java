package designpatterns.state.Light;

public class YellowLightState implements State {
    @Override
    public void displaySignal() {
        System.out.println("🟡 黄灯亮起：警告，即将切换状态");
    }

    @Override
    public void handleSignalChange(TrafficLight context) {
        System.out.println("🚦 黄灯切换为红灯");
        context.setState(new RedLightState()); // 切换到红灯状态
    }
}