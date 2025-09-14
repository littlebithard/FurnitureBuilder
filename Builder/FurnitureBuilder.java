package Java.Builder;

import Java.Product.Furniture;

public interface FurnitureBuilder {
    FurnitureBuilder setType(String type);

    FurnitureBuilder setMaterial(String material);

    FurnitureBuilder setColor(String color);

    FurnitureBuilder setDimensions(double height, double width, double depth);

    FurnitureBuilder setCushion(int hasCushion);

    Furniture build();
}
