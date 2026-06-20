package designpatterns.facade.HomeTheaterFacade;

public class TheaterLights {
    private String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {        System.out.println(description + " on");    }
    public void dim(int level) {        System.out.println(description + " dimming to " + level + "%");    }
}