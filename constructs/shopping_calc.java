package constructs;

public class shopping_calc {
    public static void main(String[] args) {
        int price = 2500, quantity = 5;
        float discount = 0.1f, gst = 0.05f;

        int cart_value = price * quantity;
        float total_payable = price;

        if (cart_value > 5000) {
            total_payable -= (discount * total_payable); 
        }

        total_payable += gst * total_payable;

        System.out.println("Total payable: " + total_payable);
    }
}
