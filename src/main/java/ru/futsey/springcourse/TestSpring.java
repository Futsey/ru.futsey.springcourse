package ru.futsey.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    /**
     * Конфигурация SpringApp посредством XML файла конфигурации
     * @param args
     * @author ANDREW PETRUSHIN
     * @version 1.0
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
