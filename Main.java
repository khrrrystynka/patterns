import creational.singleton.Singleton;
import creational.factory.Product;
import creational.factory.ProductFactory;
import creational.abstractfactory.*;
import creational.builder.House;
import creational.builder.HouseBuilder;
import creational.prototype.Prototype;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method
        Product productA = ProductFactory.createProduct("A");
        productA.use();

        // Abstract Factory
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.render();

        // Builder
        House house = new HouseBuilder().buildWalls("Цегляні").buildRoof("Металевий").build();
        house.showHouse();

        // Prototype
        Prototype original = new Prototype("Оригінальні дані");
        Prototype copy = original.clone();
        copy.showData();
    }
}
