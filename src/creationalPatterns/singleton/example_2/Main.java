package creationalPatterns.singleton.example_2;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Это синглтон");
        Singleton anotherSingleton = Singleton.getInstance("Это не синглтон");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}