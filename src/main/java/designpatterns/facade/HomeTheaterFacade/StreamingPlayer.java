package designpatterns.facade.HomeTheaterFacade;

public class StreamingPlayer {
    private String description;
    private Amplifier amplifier;

    public StreamingPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {        System.out.println(description + " on");    }
    public void off() {        System.out.println(description + " off");    }
    public void play(String movie) {        System.out.println(description + " playing \"" + movie + "\"");    }
    public void stop() {        System.out.println(description + " stopped");    }
}