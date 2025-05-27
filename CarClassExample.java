public class CarClassExample {
    String make;
    String model;
    int year;

    public CarClassExample(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        CarClassExample car1 = new CarClassExample("Toyota", "Corolla", 2020);
        CarClassExample car2 = new CarClassExample("Honda", "Civic", 2019);
        car1.displayDetails();
        car2.displayDetails();
    }
}
