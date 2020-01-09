package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Polygon;

public class PolygonFactoryTest {
    public static void test() {

        Polygon polygon = null;

        System.out.println("Attempt to create triangle:");
        polygon = new TriangleFactory().create();
        polygon.printDetails();

        System.out.println("Attempt to create square:");
        polygon = new SquareFactory().create();
        polygon.printDetails();

        System.out.println("Attempt to create pentagon:");
        polygon = new PentagonFactory().create();
        polygon.printDetails();
    }
}
