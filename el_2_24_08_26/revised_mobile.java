package el_2_24_08_26;

import java.util.Scanner;

public class revised_mobile {
    public static void main(String[] args) {
        int number_of_mobiles = 5;
        Mobile[] inventory = new Mobile[number_of_mobiles];
        for (int i = 0; i < number_of_mobiles; i++) {
            System.out.println("Mobile " + (i + 1));
            inventory[i] = new Mobile();
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter the price of the smartphone: ");
            float price = sc.nextFloat();

            System.out.print("Enter the brand of the smartphone: ");
            String brand = sc.next();

            System.out.print("Enter the color of the smartphone: ");
            String color = sc.next();

            inventory[i].setValues(price, brand, color);
            System.out.println("\n");
        }
        
        System.out.println("----------------------------------");
        System.out.println("Printing details of given phones: ");
        for (int i = 0; i < number_of_mobiles; i++) {
            System.out.println("Mobile " + (i + 1));
            inventory[i].printValues();
            System.out.println("\n");
        }
    }    
}

class Mobile {
    float price;
    String brand;
    String color;

    public void setValues(float input_price, String input_brand, String input_color) {
        price = input_price;
        brand = input_brand;
        color = input_color;
    }

    public void printValues() {        
        System.out.println("Price of the smartphone: " + price);
        System.out.println("Brand of the smartphone: " + brand);
        System.out.println("Color of the smartphone: " + color);
    }
};
