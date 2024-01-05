package structuralPatterns.decorator.example_1;

public interface DataSource {
    void writeData(String data);

    String readData();
}