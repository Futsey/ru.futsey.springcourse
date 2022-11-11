package ru.futsey.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Конфигурация SpringApp посредством XML файла конфигурации
 * @author ANDREW PETRUSHIN
 * @version 1.2
 */
public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicStyle.ROCKMUSIC);
        musicPlayer.playMusic(MusicStyle.CLASSICALMUSIC);
        musicPlayer.playMusic(MusicStyle.CHILLMUSIC);

        context.close();
    }
}
