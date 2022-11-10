package ru.futsey.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    /**
     * Конфигурация SpringApp посредством XML файла конфигурации
     * @param args
     * @author ANDREW PETRUSHIN
     * @version 1.2
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("myRockMusic", Music.class);
//        MusicPlayer mPlayer = new MusicPlayer(music);
//        mPlayer.playMusic();
//
//        Music classmusic = context.getBean("myClassicalMusic", Music.class);
//        mPlayer = new MusicPlayer(classmusic);
//        mPlayer.playMusic();
//
//        Music chillmusic = context.getBean("chillMusic", Music.class);
//        mPlayer = new MusicPlayer(chillmusic);
//        mPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
