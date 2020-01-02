package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.exception.PolygonNotExist;
import pl.ioii.designpatterns.factory.model.Polygon;

public class PolygonFactoryTest {
    public static void test() {

        System.out.println("Attempt to create triangle:");
        Polygon polygon = PolygonFactory.getExistingPolygon(3);
        polygon.printDetails();

        System.out.println("Attempt to create square:");
        polygon = PolygonFactory.getExistingPolygon(4);
        polygon.printDetails();

        System.out.println("Attempt to create pentagon:");
        polygon = PolygonFactory.getExistingPolygon(5);
        polygon.printDetails();

        System.out.println("Attempt to create hexagon:");
        try {
            polygon = PolygonFactory.getExistingPolygon(6);
            polygon.printDetails();
        } catch (PolygonNotExist e) {
            System.out.println(e.toString());
        }
    }
}
