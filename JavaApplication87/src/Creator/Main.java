/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creator;

/**
 *
 * @author a
 */
// Shape Interface
interface Shape {
    void draw();
}

// Concrete Shape Classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawn.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square drawn.");
    }
}

// Creator Class
class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory(); // Create factory

        Shape shape1 = shapeFactory.createShape("CIRCLE"); // Create Circle
        shape1.draw(); // Draw Circle

        Shape shape2 = shapeFactory.createShape("SQUARE"); // Create Square
        shape2.draw(); // Draw Square
    }
}

