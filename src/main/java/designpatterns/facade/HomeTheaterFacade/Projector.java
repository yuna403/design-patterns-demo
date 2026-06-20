package designpatterns.facade.HomeTheaterFacade;

public class Projector {
    private String description;
    private StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {        System.out.println(description + " on");    }
    public void off() {        System.out.println(description + " off");    }
    public void wideScreenMode() {        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");    }
}