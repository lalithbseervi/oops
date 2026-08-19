package classes_and_objects;

public class abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
    }
}

abstract class Shape {
    abstract void draw();
} 

class Circle extends Shape {
    void draw() {
        System.out.println("A circle was drawn!");
    }
}
