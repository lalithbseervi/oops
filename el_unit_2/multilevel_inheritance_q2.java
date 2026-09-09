package el_unit_2;

class Vehicle {
    String classification;
    int capacity;

    void start() {
        System.out.println("Started vehicle.");
    }

    void display_vehicle_details() {
        System.out.println("Vehicle Classification: " + classification);
        System.out.println("Car Passenger Capacity: " + capacity);
    }
}

class Car extends Vehicle {
    String brand;
    String top_speed_in_kmph;
    String compatible_fuel_type;
    boolean air_conditioninig_on;

    void toggleAC(Boolean ac_toggle) {
        air_conditioninig_on = ac_toggle;
    }

    void display_car_details() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Top Speed in kmph: " + top_speed_in_kmph);
        System.out.println("Compatible fuel type: " + compatible_fuel_type);
        System.out.println("Air Conditioning: " + air_conditioninig_on);
    }
}

class ElectricCar extends Car {
    int remaining_battery_charge;

    ElectricCar() {
        super.brand = "Tesla";
        super.top_speed_in_kmph = "120";
        super.compatible_fuel_type = "Lithium Battery";
        super.air_conditioninig_on = false;
        super.classification = "Electric Vehicle";
        super.capacity = 5;
    }

    void charge() {
        remaining_battery_charge = 80;
        System.out.println("Charged car to 80%");
    }

    void display_battery_level() {
        System.out.println("Current battery percentage: " + remaining_battery_charge + "%");
    }
}

public class multilevel_inheritance_q2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        tesla.display_vehicle_details();
        tesla.display_car_details();
        tesla.charge();
        tesla.display_battery_level();
    }
}
