package ru.futsey.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private Music rockMusic;
    private Music classicalMusic;
    private Music chillMusic;
    private String name;
    private int volume;

    /**
     * IoC principle (Inversion of control)
     */
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Autowired
    public MusicPlayer(@Qualifier("myRockMusic") Music rockMusic,
                       @Qualifier("myClassicalMusic") Music classicalMusic,
                       @Qualifier("chillMusic") Music chillMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.chillMusic = chillMusic;
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
            System.out.println("Playing: ".concat(rockMusic.getSong())
                    .concat(System.lineSeparator().concat(classicalMusic.getSong())));
    }

    public void playMusic (MusicStyle musicStyle) {
        if (musicStyle.equals(MusicStyle.ROCKMUSIC)) {
            System.out.println("Playing: ".concat(rockMusic.getRandomSong()));
        }
        if (musicStyle.equals(MusicStyle.CLASSICALMUSIC)) {
            System.out.println("Playing: ".concat(classicalMusic.getRandomSong()));
        }
        if (musicStyle.equals(MusicStyle.CHILLMUSIC)) {
            System.out.println("Playing: ".concat(chillMusic.getRandomSong()));
        }
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
