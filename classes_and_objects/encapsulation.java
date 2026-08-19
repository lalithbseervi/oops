package classes_and_objects;

public class encapsulation {
    public static void main(String[] args) {
        Demo person = new Demo();
        person.setName("Rodrigo");
        System.out.println("Given name is: " + person.getName());
    }
}

class Demo {
    private String name;
    
    public void setName(String name_input) {
        name = name_input;
    }

    public String getName() {
        return name;
    }
}