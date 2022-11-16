package ru.futsey.springcourse.simplemusicplayer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

public class ClassicalMusic implements Music {

    String[] songArray = {"Liszt - Hungarian Rhapsody", "Mozart – Eine kleine Nachtmusik", "Beethoven – F?r Elise"};

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization of classical music");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return songArray[0];
    }

    public String getRandomSong() {
        Random random = new Random();
        return songArray[random.nextInt(songArray.length)];
    }
}
