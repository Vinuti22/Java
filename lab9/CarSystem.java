class Car {
    String brand; // [cite: 24]
    int speed;    // [cite: 25]

    Car(String brand, int speed) { // [cite: 26]
        this.brand = brand; // [cite: 27]
        this.speed = speed; // [cite: 28]
    }

    void displayInfo() { // [cite: 30]
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h"); // [cite: 31]
    }
}

class Sedan extends Car { // [cite: 34]
    Sedan(String brand, int speed) {
        super(brand, speed); // [cite: 36]
    }
    void fuelConsumption() { // [cite: 38]
        System.out.println("Sedan fuel consumption: 7 liters/100km"); // [cite: 39]
    }
}

class Truck extends Car { // [cite: 42]
    Truck(String brand, int speed) {
        super(brand, speed); // [cite: 44]
    }
    void fuelConsumption() { // [cite: 46]
        System.out.println("Truck fuel consumption: 20 liters/100km"); // [cite: 47]
    }
}

public class CarSystem {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 180); // [cite: 52]
        Truck truck = new Truck("Volvo", 120);   // [cite: 53]
        sedan.displayInfo(); // [cite: 54]
        sedan.fuelConsumption(); // [cite: 55]
        truck.displayInfo(); // [cite: 56]
        truck.fuelConsumption(); // [cite: 57]
    }
}