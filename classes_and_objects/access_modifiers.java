package classes_and_objects;

public class access_modifiers {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("From Main class:");
    System.out.println("Public: " + obj.pubVar);
        System.out.println("Protected: " + obj.proVar);
        System.out.println("Default: " + obj.defVar);
        // System.out.println("Private: " + obj.priVar);
        obj.showData(); // Accessing private through method
    }
}

class Demo {
    public int pubVar = 10;
    protected int proVar = 20;
    int defVar = 30;
    private int priVar = 40;

    public void showData() {
        System.out.println("Inside Demo class:");
        System.out.println("Public: " + pubVar);
        System.out.println("Protected: " + proVar);
        System.out.println("Default: " + defVar);
        System.out.println("Private: " + priVar);
    }
}
