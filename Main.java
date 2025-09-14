package Java;
import Java.Director.FurnitureDirector;
import Java.Builder.ConcreteFurnitureBuilder;
import Java.Product.Furniture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureDirector director = new FurnitureDirector();

        System.out.println("Choose furniture to build:");
        System.out.println("1. Office Chair");
        System.out.println("2. Coffee Table");
        System.out.println("3. Sofa");
        System.out.println("4. Custom Furniture");
        System.out.print("Enter choice (1-4): ");

        int choice = scanner.nextInt();
        Furniture furniture = customerChoice(choice, director, scanner);

        if (furniture != null) {
            System.out.println("Built furniture: " + furniture);
        }

        scanner.close();
    }

    public static Furniture customerChoice(int choice, FurnitureDirector director, Scanner scanner) {
        Furniture furniture = null;
        switch (choice) {
            case 1 -> furniture = director.createOfficeChair();
            case 2 -> furniture = director.createCoffeeTable();
            case 3 -> furniture = director.createSofa();
            case 4 -> {
                scanner.nextLine();
                System.out.print("Enter type: ");
                String type = scanner.nextLine();
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                System.out.print("Enter color: ");
                String color = scanner.nextLine();
                System.out.print("Enter height, width, depth: ");
                double h = scanner.nextDouble(), w = scanner.nextDouble(), d = scanner.nextDouble();
                System.out.print("Enter cushion quantity: ");
                int cushion = scanner.nextInt();

                furniture = new ConcreteFurnitureBuilder()
                        .setType(type)
                        .setMaterial(material)
                        .setColor(color)
                        .setDimensions(h, w, d)
                        .setCushion(cushion)
                        .build();
            }
            default -> {
                System.out.println("Invalid choice!");
                return null;
            }
        }
        return furniture;
    }
}