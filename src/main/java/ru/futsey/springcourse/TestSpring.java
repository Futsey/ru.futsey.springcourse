package ru.futsey.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    /**
     * Конфигурация SpringApp посредством XML файла конфигурации
     * @param args
     * @author ANDREW PETRUSHIN
     * @version 1.1
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * Singleton and prototype scope example
         */
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean compare = firstMusicPlayer == secondMusicPlayer;
        System.out.println("Is firstMusicPlayer refers on same bean secondMusicPlayer: ".concat(String.valueOf(compare)));
        System.out.println("firstMusicPlayer: ".concat(String.valueOf(firstMusicPlayer)));
        System.out.println("secondMusicPlayer: ".concat(String.valueOf(secondMusicPlayer)));

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(15);
        firstMusicPlayer.setName("Andrew");

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
