package designpatterns.command.Player;

public class Controller {
    private Command playButton;
    private Command stopButton;
    private Command pauseButton;
    private Command seekButton;

    public void setPlayCommand(Command cmd) {
        this.playButton = cmd;
    }

    public void setStopCommand(Command cmd) {
        this.stopButton = cmd;
    }

    public void setPauseCommand(Command cmd) {
        this.pauseButton = cmd;
    }

    public void setSeekCommand(Command cmd) {
        this.seekButton = cmd;
    }

    public void pressPlayButton() {
        playButton.execute();
    }

    public void pressStopButton() {
        stopButton.execute();
    }

    public void pressPauseButton() {
        pauseButton.execute();
    }

    public void pressSeekButton() {
        seekButton.execute();
    }
}