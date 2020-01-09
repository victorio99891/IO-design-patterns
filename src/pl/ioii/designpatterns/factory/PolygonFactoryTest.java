package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.exception.PolygonNotFound;
import pl.ioii.designpatterns.factory.model.Polygon;

public class PolygonFactoryTest {
    public static void test() {

        PolygonFactory polygonFactory = new PolygonFactory();

        System.out.println("Attempt to create triangle:");
        Polygon polygon = polygonFactory.create(3);
        polygon.printDetails();

        System.out.println("Attempt to create square:");
        polygon = polygonFactory.create(4);
        polygon.printDetails();

        System.out.println("Attempt to create pentagon:");
        polygon = polygonFactory.create(5);
        polygon.printDetails();

        System.out.println("Attempt to create hexagon:");
        try {
            polygon = polygonFactory.create(6);
            polygon.printDetails();
        } catch (PolygonNotFound e) {
            System.out.println(e.toString());
        }
    }
}
