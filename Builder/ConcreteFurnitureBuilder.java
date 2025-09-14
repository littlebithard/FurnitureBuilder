package Java.Builder;

import Java.Product.Furniture;

public class ConcreteFurnitureBuilder implements FurnitureBuilder {
    private Furniture.Builder builder;

    public ConcreteFurnitureBuilder() {
        this.builder = new Furniture.Builder();
    }

    public FurnitureBuilder setType(String type) {
        builder.setType(type);
        return this;
    }

    public FurnitureBuilder setMaterial(String material) {
        builder.setMaterial(material);
        return this;
    }

    public FurnitureBuilder setColor(String color) {
        builder.setColor(color);
        return this;
    }

    public FurnitureBuilder setDimensions(double height, double width, double depth) {
        builder.setDimensions(height, width, depth);
        return this;
    }

    public FurnitureBuilder setCushion(int hasCushion) {
        builder.setCushion(hasCushion);
        return this;
    }

    public Furniture build() {
        return builder.build();
    }
}