package creational.builder;

public class HouseBuilder {
    private final House house = new House();

    public HouseBuilder buildWalls(String material) {
        house.setWalls(material);
        return this;
    }

    public HouseBuilder buildRoof(String type) {
        house.setRoof(type);
        return this;
    }

    public House build() {
        return house;
    }
}