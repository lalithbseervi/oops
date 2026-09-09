package interfaces;

interface Car {
    void start();
}

interface Vehicle {
    void start();
    void fuelType();
}

class HybridCar implements Car, Vehicle {
    public void start() {
        System.out.println("Starting hybrid car.");
    }
    public void fuelType() {
        System.out.println("Fuel Type: Electric + Petrol");
    }
}

public class interface_eg {
    public static void main(String[] args) {
        HybridCar hc = new HybridCar();
        hc.start();
        hc.fuelType();

        Car c = hc;
        c.start();

        Vehicle v = hc;
        v.start();
        v.fuelType();
    }
}
