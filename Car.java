public class Car {
private String manufacturer;
private String model;
private int fabYear;

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFabYear() {
        return this.fabYear;
    }

    public void setFabYear(int fabYear) {
        this.fabYear = fabYear;
    }

    public Car(String manufacturer, String model, int fabYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.fabYear = fabYear;
    }





}
