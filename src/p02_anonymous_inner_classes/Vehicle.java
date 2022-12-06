package p02_anonymous_inner_classes;

public class Vehicle {
    // the Vehicle class has three fields
    // Private Fields CANNOT be accessed by the subclasses
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    protected boolean isPreOwned = false;

    // the Vehicle class has one constructor
    public Vehicle(String brand, String type, String wheels, int year) {
        this.brand = brand;
        this.type = type;
        this.wheels = wheels;
        this.year = year;
    }

    public Vehicle() {
    }

    // the Bicycle class has four methods
    public void StartDriving() {
        System.out.println("Start Driving");
    }

    public void stopDriving() {
        System.out.println("Stop Driving");
    }

    public void turn(String direction) {
        System.out.println("Turn " + direction);
    }

    public void getVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("type: " + type);
        System.out.println("wheels: " + wheels);
        System.out.println("year: " + year);
    }

    // we will add this method to get a record/list about the major recent
    // maintenance only
    public void getRecord(String fixPart, double cost) {
        System.out.println("What to fix: " + fixPart);
        System.out.println("Total Cost: " + cost);
    }
}
