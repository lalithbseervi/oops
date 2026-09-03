package classes_and_objects.el_03_09;

public class Car {
    String brand;
    String color;
    int price;

    Car() {
        brand = "Uninitialized";
        color = "Uninitialized";
        price = 50000;
    }

    Car(String b, String c, int p) {
        brand = b;
        color = c;
        price = p;
    }

    Car(Car c) {
        brand = c.brand;
        color = c.color;
        price = c.price;
    }

    void display() {
        System.out.println("Car Details");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price + "\n");
    }

    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Car default_constructor = new Car();
        default_constructor.display();

        System.out.println("Parameterized Constructor");
        Car parameterized_constructor = new Car("Toyota", "Matte Red", 550000);
        parameterized_constructor.display();

        System.out.println("Copy Constructor");
        Car copy_constructor = new Car(parameterized_constructor);
        copy_constructor.display();
    }
}
