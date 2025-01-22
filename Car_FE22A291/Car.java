public class Car {
    
    //Private atrributes
    private String make;
    private String model;
    private int year;
    private double mileage;

    //Constructor
    public Car(String make, String model, int year, double mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    //Method to update mileage
    public void updateMilage(double newMilage){
        this.mileage = newMilage;
    }

    //Method to display Car Details
    public void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }

    //Getters for attributes
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }

    //Setters for attributes

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2019, 15000 );
        myCar.displayDetails();
        myCar.updateMilage(22200);
        System.out.println("Updated mileage");
        myCar.displayDetails();
    }

}