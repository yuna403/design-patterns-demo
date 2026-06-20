package designpatterns.facade.HomeTheaterFacade;

public class HomeTheaterFacade {
    private PopcornPopper popper;
    private TheaterLights lights;
    private Screen screen;
    private Projector projector;
    private Amplifier amp;
    private StreamingPlayer player;

    public HomeTheaterFacade(
            PopcornPopper popper,
            TheaterLights lights,
            Screen screen,
            Projector projector,
            Amplifier amp,
            StreamingPlayer player
    ) {
        this.popper = popper;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
        this.amp = amp;
        this.player = player;
    }

    public void watchMovie(String movie) {
        System.out.println("===== Starting Movie =====");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("===== Ending Movie =====");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}