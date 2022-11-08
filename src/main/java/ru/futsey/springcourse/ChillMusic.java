package ru.futsey.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ChillMusic implements Music {
    public String getSong() {
        return "Ed Sheeran - The Joker And The Queen";
    }
}
