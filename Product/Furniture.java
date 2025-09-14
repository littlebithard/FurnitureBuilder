package Java.Product;

public class Furniture {
    private final String type;
    private final String material;
    private final String color;
    private final double height;
    private final double width;
    private final double depth;
    private final boolean hasCushion;

    private Furniture(Builder builder) {
        this.type = builder.type;
        this.material = builder.material;
        this.color = builder.color;
        this.height = builder.height;
        this.width = builder.width;
        this.depth = builder.depth;
        this.hasCushion = builder.hasCushion;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public boolean hasCushion() {
        return hasCushion;
    }

    public String toString() {
        return String.format("\nFurniture: {\nType = %s, \nMaterial = %s, \nColor = %s, \nSize = %.1fx%.1fx%.1f, \nCushion = %s\n}",
                type, material, color, height, width, depth, hasCushion);
    }

    public static class Builder {
        private String type;
        private String material;
        private String color;
        private double height;
        private double width;
        private double depth;
        private boolean hasCushion;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setDimensions(double height, double width, double depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
            return this;
        }

        public Builder setCushion(boolean hasCushion) {
            this.hasCushion = hasCushion;
            return this;
        }

        public Furniture build() {
            return new Furniture(this);
        }
    }
}
