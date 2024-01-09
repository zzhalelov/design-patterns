package creationalPatterns.singleton.example_2;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Я - реализация синглтона");
        Singleton anotherSingleton = Singleton.getInstance("Возможно я тоже являюсь синглтоном");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}