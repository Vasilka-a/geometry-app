import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;
import geometry.threeDimensional.Cube;
import geometry.threeDimensional.Sphere;
import geometry.utils.Converter;
import geometry.utils.ShapeComparator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);// 4 метра
        circle.displayInfo();
        System.out.println(Converter.metersToCentimeters(circle.getArea()) + " cm");// конвертер в см

        System.out.println("------------------------------------------------------");

        Rectangle rectangle = new Rectangle(800, 40);// сантиметры
        rectangle.displayInfo();
        System.out.println(Converter.centimetersToMeters(rectangle.getArea()) + " m");// конвертер в метры

        System.out.println("------------------------------------------------------");

        Triangle triangle = new Triangle(6, 4, 7);
        triangle.displayInfo();

        System.out.println("------------------------------------------------------");

        int compare = ShapeComparator.compareAreas(circle.getArea(), Converter.centimetersToMeters(rectangle.getArea()));
        if (compare == 1){
            System.out.println("Circle area has larger area");
        } else if (compare == -1) {
            System.out.println("Rectangle area has larger area");
        } else
            System.out.println("Areas are equal");

        System.out.println("------------------------------------------------------");

        Cube cube = new Cube(12);
        cube.displayInfo();

        System.out.println("------------------------------------------------------");

        Sphere sphere = new Sphere(44);
        sphere.displayInfo();
        System.out.println(Converter.centimetersToMeters(sphere.getSurfaceArea()));

    }


}
