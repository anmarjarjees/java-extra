package p02_anonymous_inner_classes;

public class Car extends Vehicle {

    // Adding two new custom fields:
    private String fuelType;
    private int purchaseYear;

    public Car() {
        // we need to access the constructor
        // from the superclass "Vehicle":
        super();
    }

    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        // calling the constructor from the superclass:
        // to initialize the private fields:
        super(brand, type, wheels, year);
        // initialize the 2 custom fields:
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Printing car specifications
    public void getCarSpecs() {
        /*
         * First, we need to call the method "getVehicleInfo()" from the parent class
         * 
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

    // We can override the method "startDriving()":
    // But we don't want every car to drive on water!
    /*
     * @Override
     * public void startDriving() {
     * System.out.println("Driving on water!");
     * }
     */

}
