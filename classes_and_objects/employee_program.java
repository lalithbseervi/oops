package classes_and_objects;

public class employee_program {
    public static void main(String[] args) {
        Employee emp_1 = new Employee();
        emp_1.name = "Daksh";
        emp_1.salary = 65000.00f;

        emp_1.display();
    }
}

class Employee {
    float salary;
    String name;

    void display() {
        System.out.println("Name: " + name + "\nSalary: " + salary);
    }
}