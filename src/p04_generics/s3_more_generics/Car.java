package p04_generics.s3_more_generics;

/*
 * Car class extends Vehicle
 * Adds purchaseYear and fuelType specific to cars
 */
public class Car extends Vehicle {

    private int purchaseYear;
    protected String fuelType;

    public Car() {
        // calls Vehicle default constructor:
        super();
    }

    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        // calling parent class constructor
        super(brand, type, wheels, year); // calling parent class constructor
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Display full car specifications
    public void getCarSpecs() {
        /*
         * First, we need to call the method "getVehicleInfo()" from the parent class
         */
        getVehicleInfo();
        // Just adding our extra info:
        System.out.println("Fuel Type: " + fuelType);
    }

    // Creating another method with the same name "getCarRecord"
    // from the original class:
    public void getRecord() {
        // String fixPart, double cost
        super.getRecord("Breaks", 869.73);
        System.out.println("Purchase Year: " + purchaseYear);
    }
}
