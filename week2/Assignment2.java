public class Assignment2 {
    public static void main(String[] args) {
        
        double length = 100;
        double width = 30;
        double diameter = 5;
        double flowerBedLength = 2;

        //
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