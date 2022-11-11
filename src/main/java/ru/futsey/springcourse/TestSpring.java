package ru.futsey.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringApp config with XML configuration file
 * @author ANDREW PETRUSHIN
 * @version 1.2
 */
public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("myClassicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("myClassicalMusic", ClassicalMusic.class);

        /**
         * Will be true because scope is "singleton" in
         * @see ClassicalMusic
         */
        System.out.println("Is one object? ".concat(String.valueOf(classicalMusic == classicalMusic1)));


        context.close();
    }
}
