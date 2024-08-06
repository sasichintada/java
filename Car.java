public class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
    }
    
    // Main method to test the Car class
    public static void main(String[] args) {
        // Create an object (instance) of the Car class
        Car myCar = new Car("Toyota", "Camry");
        
        // Call the displayDetails method to show car details
        myCar.displayDetails();
    }
}
