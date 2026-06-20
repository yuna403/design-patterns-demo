package designpatterns.state.Light;

public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(); // 初始状态：红灯

        // 模拟三次状态切换
        trafficLight.changeSignal(); // 红灯 → 绿灯
        trafficLight.changeSignal(); // 绿灯 → 黄灯
        trafficLight.changeSignal(); // 黄灯 → 红灯
    }
}