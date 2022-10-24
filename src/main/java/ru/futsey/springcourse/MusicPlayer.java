package ru.futsey.springcourse;

public class MusicPlayer {

    private Music music;

    /**
     * IoC principle (Inversion of control)
     */
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("Playing: ".concat(music.getSong()));
    }
}
