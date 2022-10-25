package ru.futsey.springcourse;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    /**
     * IoC principle (Inversion of control)
     */
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic () {
        System.out.println("Playing: ".concat(music.getSong()));
    }
}
