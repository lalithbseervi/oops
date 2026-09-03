package classes_and_objects;

public class main {
    private String name;

    main() {
        System.out.println("Constructor Called");
        name = "PESU";
    }

    public static void main(String[] args) {
        main obj = new main();
        System.out.println("The name is " + obj.name);
    }
}
