import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.displayInfo();

        System.out.println("------------------------------------------------------");

        Rectangle rectangle = new Rectangle(8, 4);
        rectangle.displayInfo();

        System.out.println("------------------------------------------------------");

        Triangle triangle = new Triangle(6, 4, 7);
        triangle.displayInfo();
    }
}
