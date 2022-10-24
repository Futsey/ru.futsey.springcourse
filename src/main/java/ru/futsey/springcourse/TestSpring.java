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
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
