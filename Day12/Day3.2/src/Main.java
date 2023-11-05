public class Main {
    public static void main(String[] args) {
        // Create a Car object using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Access attributes using getter methods
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
