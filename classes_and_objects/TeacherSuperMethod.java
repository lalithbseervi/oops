package classes_and_objects;

class School {
    String name = "SSM Public School";
    void showSchool() {
        System.out.println("School name from parent class: " + name);
    }
}

class Teacher extends School {
    String name = "Delhi Public School";
    void showSchool() {
        System.out.println("School name from child class: " + name);
        super.showSchool();
    }
}

public class TeacherSuperMethod {
    public static void main(String[] args) {
        Teacher ob = new Teacher();
        ob.showSchool();
    }
}
