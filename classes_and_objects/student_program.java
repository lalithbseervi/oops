package classes_and_objects;

public class student_program {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akash";
        s1.age = 20;

        s1.display();
    }   
}

class Student {
    String name;
    int age;
    
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
