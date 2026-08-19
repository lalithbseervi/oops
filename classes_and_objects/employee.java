package classes_and_objects;

public class employee {
    int salary, emp_id;
    String name;

    void display() { 
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.salary = 56000;
        e.emp_id = 1;
        e.name = "Ravi";
        e.display();
    }
}
