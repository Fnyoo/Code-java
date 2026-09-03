import java.util.Scanner;

public class inputdinamis2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the land: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the land: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the diameter of the pond: ");
        double diameter = scanner.nextDouble();

        System.out.print("Enter the length of the flower bed: ");
        double flowerBedLength = scanner.nextDouble();

        double surfaceArea = length * width;
        double jarijari = diameter / 2;
        double pond_area = Math.PI * jarijari * jarijari;
        double flower_area_size = flowerBedLength * diameter;
        double unused_area = surfaceArea - pond_area - flower_area_size;

        System.out.println("Surface area: " + surfaceArea + " m2");
        System.out.println("Pond area: " + pond_area + " m2");
        System.out.println("Flower bed area: " + flower_area_size + " m2");
        System.out.println("Unused land area: " + unused_area + " m2");
    }
}
