package creational.prototype;

public class Prototype implements Cloneable {
    private final String data;

    public Prototype(String data) {
        this.data = data;
    }

    public Prototype clone() {
        return new Prototype(this.data);
    }

    public void showData() {
        System.out.println("Дані: " + data);
    }
}
