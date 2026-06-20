package designpatterns.command.Player;

public class PlayerKernel {
    public void play() {
        System.out.println("播放器开始播放...");
    }

    public void stop() {
        System.out.println("播放器停止播放");
    }

    public void pause() {
        System.out.println("播放器暂停");
    }

    public void seek(int position) {
        System.out.println("跳转到进度：" + position + "%");
    }
}