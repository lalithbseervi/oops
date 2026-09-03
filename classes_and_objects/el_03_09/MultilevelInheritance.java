package classes_and_objects.el_03_09;

class Device {
    String brand;

    void showDevice() {
        System.out.println("Brand: " + brand);
    }
}

class SmartDevice extends Device {
    String wifiVersion;

    void showSmartFeatures() {
        System.out.println("\nSmart Device Features");
        System.out.println("Wifi Version: " + wifiVersion);
    }
}

class SmartPhone extends SmartDevice {
    String simType;

    void showPhoneFeatures() {
        System.out.println("\nSmart Phone Features");
        System.out.println("Sim Type: " + simType);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SmartPhone google_pixel_10a = new SmartPhone();
        google_pixel_10a.brand = "Google";
        google_pixel_10a.wifiVersion = "4G, 4G VOLTE, 5G";
        google_pixel_10a.simType = "Dual sim card tray";

        google_pixel_10a.showDevice();
        google_pixel_10a.showSmartFeatures();
        google_pixel_10a.showPhoneFeatures();
    }
}
