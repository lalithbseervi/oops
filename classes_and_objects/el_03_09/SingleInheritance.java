package classes_and_objects.el_03_09;

class Bird {
    void fly() {
        System.out.println("I am a bird");
    }
}

class Parrot extends Bird {
    void whatColorAmI() {
        System.out.println("I am green!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.whatColorAmI();
        p.fly();
    }
}
