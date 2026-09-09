package el_unit_2;

class Car {
    String brand;
    String color;
    int price;

    Car() {
        brand = "null";
        color = "null";
        price = 0; 
    }

    Car(String input_brand, String input_color, int input_price) {
        brand = input_brand;
        color = input_color;
        price = input_price;
    }

    Car(Car c) {
        brand = c.brand;
        color = c.color;
        price = c.price;
    }

    void display_car_details() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
    }
}

public class types_of_constructors_q1 {
    public static void main(String[] args) {
        System.out.println("Creating Car using Default Constructor");
        Car default_car = new Car();
        default_car.display_car_details();

        System.out.println("\nCreating Car using Parameterized Constructor");
        Car parameterized_car = new Car("Tata Nexon", "Red", 1500000);
        parameterized_car.display_car_details();

        System.out.println("\nCreating Car using Copy Constructor");
        Car copy_car = new Car(parameterized_car);
        copy_car.display_car_details();
    }
}
