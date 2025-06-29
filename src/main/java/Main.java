import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;
import geometry.utils.Converter;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.displayInfo();
        double areaCircle = circle.getArea();
        System.out.println(Converter.metersToCentimeters(areaCircle));// конвертер в см

        System.out.println("------------------------------------------------------");

        Rectangle rectangle = new Rectangle(800, 40);
        rectangle.displayInfo();
        System.out.println(Converter.centimetersToMeters(rectangle.getPerimeter()));// конвертер в метры

        System.out.println("------------------------------------------------------");

        Triangle triangle = new Triangle(6, 4, 7);
        triangle.displayInfo();
    }
}
