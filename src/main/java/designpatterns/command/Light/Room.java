package designpatterns.command.Light;

public class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void openLamp() {
        System.out.println(name + "的灯已打开");
    }

    public void closeLamp() {
        System.out.println(name + "的灯已关闭");
    }
}
