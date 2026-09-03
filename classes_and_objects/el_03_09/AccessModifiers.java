package classes_and_objects.el_03_09;

class Person {
    public String name;
    protected int age;
    String address;
    private String aadharNo;
    
    public void setAadhar(String aadhar) {
        aadharNo = aadhar;
    }

    public void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Aadhar: " + aadharNo);
    }
}

class Student extends Person {
    public String studentId; // Public field in child
    public void showStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name); // public
        System.out.println("Age: " + age); // protected
        System.out.println("Address: " + address); // default
        // System.out.println("Aadhar: " + aadharNo);
        System.out.println("Student ID: " + studentId);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Ananya";
        s.age = 19;
        s.address = "Mysore";
        s.studentId = "ST101";
        
        s.setAadhar("XXXX-YYYY-ZZZZ");
        s.showStudent();
        s.showPerson();
    }
}
