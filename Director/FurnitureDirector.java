package Java.Director;

import Java.Builder.ConcreteFurnitureBuilder;
import Java.Product.Furniture;

public class FurnitureDirector {

    public Furniture createOfficeChair() {
        return new ConcreteFurnitureBuilder()
                .setType("Chair")
                .setMaterial("Leather")
                .setColor("Black")
                .setDimensions(1.2, 0.6, 0.6)
                .setCushion(true)
                .build();
    }

    public Furniture createCoffeeTable() {
        return new ConcreteFurnitureBuilder()
                .setType("Table")
                .setMaterial("Wood")
                .setColor("Brown")
                .setDimensions(0.5, 1.0, 0.5)
                .setCushion(false)
                .build();
    }

    public Furniture createSofa() {
        return new ConcreteFurnitureBuilder()
                .setType("Sofa")
                .setMaterial("Fabric")
                .setColor("Gray")
                .setDimensions(0.9, 2.0, 0.8)
                .setCushion(true)
                .build();
    }
}
