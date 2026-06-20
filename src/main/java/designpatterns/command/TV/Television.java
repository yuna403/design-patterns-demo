package designpatterns.command.TV;

public class Television {
    public void open() {
        System.out.println("电视机已打开");
    }

    public void close() {
        System.out.println("电视机已关闭");
    }

    public void changeChannel() {
        System.out.println("切换频道");
    }
}
