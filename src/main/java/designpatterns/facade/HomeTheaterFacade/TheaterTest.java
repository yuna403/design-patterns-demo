package designpatterns.facade.HomeTheaterFacade;

public class TheaterTest {
    public static void main(String[] args) {
        // 初始化子系统组件
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        StreamingPlayer player = new StreamingPlayer("DVD Player", amp);
        Projector projector = new Projector("HD Projector", player);

        // 创建外观类
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                popper, lights, screen, projector, amp, player
        );

        // 一键观影
        homeTheater.watchMovie("Inception");
        System.out.println("\n----------\n");
        homeTheater.endMovie();
    }
}