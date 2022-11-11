package ru.futsey.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("myRockMusic")
public class RockMusic implements Music {

    String[] songArray = {"Queen - We will rock you", "Кино - Лето", "DDT - Осень"};

    public String getSong() {
        return "Queen - We will rock you";
    }

    public String getRandomSong() {
        Random random = new Random();
        return songArray[random.nextInt(songArray.length)];
    }
}
