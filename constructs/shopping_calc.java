package constructs;

public class shopping_calc {
    public static void main(String[] args) {
        int price = 2500, quantity = 5;
        float discount = 0.1f, gst = 0.05f;

        int cart_value = price * quantity;
        float total_payable = cart_value;
        
        System.out.println("Raw cart value: " + total_payable);

        if (cart_value > 5000) {
            total_payable -= (discount * total_payable); 
        }

        System.out.println("Raw cart value: " + total_payable);

        total_payable += gst * total_payable;
        System.out.println("GST Charges: " + (gst * total_payable));
        System.out.println("Total payable: " + total_payable);
    }
}
