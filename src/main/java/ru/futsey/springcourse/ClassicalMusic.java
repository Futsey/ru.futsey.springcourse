package ru.futsey.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("myClassicalMusic")
public class ClassicalMusic implements Music {

    String[] songArray = {"Liszt - Hungarian Rhapsody", "Mozart � Eine kleine Nachtmusik", "Beethoven � F?r Elise"};

    /**
     * ��� ������������� ���������� ������ ��� �������� �������
     * @see ClassicalMusic
     * ������������ ����������� �������� ���������� ����� ����� �������� new, ������ ��������� �����������
     */
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization of classical music");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return songArray[0];
    }

    public String getRandomSong() {
        Random random = new Random();
        return songArray[random.nextInt(songArray.length)];
    }
}
