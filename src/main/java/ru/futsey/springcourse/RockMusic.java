package ru.futsey.springcourse;

import org.springframework.stereotype.Component;

@Component("myRockMusic")
public class RockMusic implements Music {

    public String getSong() {
        return "Queen - We will rock you";
    }
}
