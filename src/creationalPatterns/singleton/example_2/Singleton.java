package creationalPatterns.singleton.example_2;

public final class Singleton {
    private static Singleton instance;
    public String value;

    public Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}