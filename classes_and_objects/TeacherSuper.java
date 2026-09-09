package classes_and_objects;

class School {
    String name;
    School() {
        name = "SSM Public School";
        System.out.println("School constructor called.");
    }
}

class Teacher extends School {
    int id; 
    String name;
    Teacher() {
        super();
        name = "Delhi Public School";
        System.out.println("Teacher constructor called.");
    }

    void display() {
        System.out.println("Child class name: " + name);
        System.out.println("Super class name: " + super.name);
    }
}

public class TeacherSuper {
    public static void main(String[] args) {
        Teacher ob = new Teacher();
        ob.display();
    }
}
