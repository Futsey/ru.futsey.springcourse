package ru.futsey.springcourse;

public class ClassicalMusic implements Music {

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
        return "Liszt - Hungarian Rhapsody";
    }


}
