package ru.futsey.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MusicPlayer {

    /**
     * @param musicList В этом поле содержится перечень музыкальных жанров
     * @param rockMusic Поле задействовано для проигрывания рокмузыки
     * @param classicalMusic Поле задействовано для проигрывания классической музыки
     * @param chillMusic Поле задействовано для проигрывания расслабляющей музыки
     * @param name Поле для именования слушателя
     * @param volume Поле для регулировки громкости
     */
    private List<Music> musicList = new ArrayList<>();
    private Music rockMusic;
    private Music classicalMusic;
    private Music chillMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(@Qualifier("myRockMusic") Music rockMusic,
                       @Qualifier("myClassicalMusic") Music classicalMusic,
                       @Qualifier("chillMusic") Music chillMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.chillMusic = chillMusic;
    }

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

    /**
     * Метод выбирает случайный жанр и в нем случайную композицию для проигрывания
     * @return проигрываемую композицию
     */
    public String playMusic () {
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size())).getRandomSong();
    }

    /**
     * Метод фильтрует заданный жанр и по итогу определяет случайную композицию в заданном жанре
     */
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
