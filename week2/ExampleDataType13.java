public class ExampleDataType13 {
    public static void main(String[] args) {
        char bloodgroup = 'A';
        byte distance = (byte) 130;
        short theNumberOfResidents = 105;
        float temperature = 60.50f;
        double weight = 0.5467812345;
        long balance = 150000000;
        int number = 0x10;

        System.out.println("My blood group is\t\t: " + (byte) bloodgroup);
        System.out.println("The distance is\t\t\t: " + distance);
        System.out.println("The number of residents is\t: " + theNumberOfResidents);          
        System.out.println("The temperature is\t\t: " + temperature);
        System.out.println("weight\t\t\t: " + (float) weight);
        System.out.println("balance\t\t\t: " + balance);
        System.out.println("number\t\t\t: " + number);

    }
}