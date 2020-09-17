package demo;

public class Goat extends Pets{
    public Goat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "BAAAAAHHHH";
    }
}
