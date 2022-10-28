package ru.futsey.springcourse;

public class ClassicalMusic implements Music {

    /**
     * ƒл€ использовани€ фабричного метода при создании объекта
     * @see ClassicalMusic
     * ограничиваем возможность создани€ экземпл€ра класс через оператор new, создав приватный конструктор
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
        return "Liszt - Hungarian Rhapsody";
    }


}
