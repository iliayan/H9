// Базовий клас Vehicle
class Vehicle {
    private double price;
    private double speed;
    private int year;

    public Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle: Price - " + price + ", Speed - " + speed + ", Year - " + year);
    }
}

// Похідний клас Plane
class Plane extends Vehicle {
    private String name;
    private int passengerCount;

    public Plane(double price, double speed, int year, String name, int passengerCount) {
        super(price, speed, year);
        this.name = name;
        this.passengerCount = passengerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Plane: Name - " + name + ", Passenger Count - " + passengerCount);
    }
}

// Похідний клас Car
class Car extends Vehicle {
    private int id;
    private String modelName;
    private String color;
    private int doorCount;

    public Car(double price, double speed, int year, int id, String modelName, String color, int doorCount) {
        super(price, speed, year);
        this.id = id;
        this.modelName = modelName;
        this.color = color;
        this.doorCount = doorCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car: ID - " + id + ", Model - " + modelName + ", Color - " + color + ", Door Count - " + doorCount);
    }
}

// Похідний клас Ship
class Ship extends Vehicle {
    private String name;
    private int passengerCount;
    private String description;

    public Ship(double price, double speed, int year, String name, int passengerCount, String description) {
        super(price, speed, year);
        this.name = name;
        this.passengerCount = passengerCount;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ship: Name - " + name + ", Passenger Count - " + passengerCount + ", Description - " + description);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляри класів
        Plane plane = new Plane(500000, 800, 2020, "Boeing 747", 500);
        Car car = new Car(30000, 120, 2022, 1, "Toyota Camry", "Blue", 4);
        Ship ship = new Ship(1000000, 30, 2021, "Royal Caribbean", 2000, "Luxury cruise ship");

        // Виводимо інформацію про кожен засіб пересування
        plane.displayInfo();
        System.out.println();

        car.displayInfo();
        System.out.println();

        ship.displayInfo();
    }
}