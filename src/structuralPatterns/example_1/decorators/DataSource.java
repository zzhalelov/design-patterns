package structuralPatterns.example_1.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}