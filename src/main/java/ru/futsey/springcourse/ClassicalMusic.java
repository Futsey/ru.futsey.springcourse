package ru.futsey.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component("myClassicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {

    String[] songArray = {"Liszt - Hungarian Rhapsody", "Mozart Ц Eine kleine Nachtmusik", "Beethoven Ц F?r Elise"};

    /**
     * ƒл€ использовани€ фабричного метода при создании объекта
     * @see ClassicalMusic
     * ограничиваем возможность создани€ экземпл€ра класс через оператор new, создав приватный конструктор
     */
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization of classical music");
    }

    @PreDestroy
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
