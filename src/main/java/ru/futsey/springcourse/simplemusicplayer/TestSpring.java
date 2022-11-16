package ru.futsey.springcourse.simplemusicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.futsey.springcourse.simplemusicplayer.ClassicalMusic;
import ru.futsey.springcourse.simplemusicplayer.MusicPlayer;
import ru.futsey.springcourse.simplemusicplayer.SpringConfig;

/**
 * SpringApp config with XML configuration file
 * @author ANDREW PETRUSHIN
 * @version 1.2
 */
public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        /**
         * Will be true because scope is "singleton" in
         * @see ClassicalMusic
         */
        System.out.println("Is the same object? ".concat(String.valueOf(classicalMusic == classicalMusic1)).concat(System.lineSeparator()));

        System.out.println("Mow playing: ".concat(musicPlayer.playMusic()));

        context.close();
    }
}
