import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(8, 4);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 7);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
