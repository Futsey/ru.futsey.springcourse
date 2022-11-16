package ru.futsey.springcourse.simplemusicplayer;

import java.util.Random;

public class ChillMusic implements Music {

    String[] songArray = {"Ed Sheeran - The Joker And The Queen", "Ed Sheeran11 - The Joker And The Queen", "Ed Sheeran22 - The Joker And The Queen"};

    public String getSong() {
        return "Ed Sheeran - The Joker And The Queen";
    }

    public String getRandomSong() {
        Random random = new Random();
        return songArray[random.nextInt(songArray.length)];
    }
}
