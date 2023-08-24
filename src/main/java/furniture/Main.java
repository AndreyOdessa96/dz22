package furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.createFurniture("chair");
        Furniture table = factory.createFurniture("table");

        chair.assemble();
        table.assemble();
    }
}