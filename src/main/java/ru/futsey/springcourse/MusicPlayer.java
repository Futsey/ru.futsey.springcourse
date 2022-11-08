package ru.futsey.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<Music>();
    private Music music;
    private String name;
    private int volume;

    /**
     * IoC principle (Inversion of control)
     */
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MusicPlayer that = (MusicPlayer) o;
        return volume == that.volume && Objects.equals(musicList, that.musicList) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicList, name, volume);
    }

    @Override
    public String toString() {
        return "MusicPlayer{"
                + "hashCode=" + hashCode()
                + ", name='" + name + '\''
                + ", volume=" + volume
                + '}';
    }
}
