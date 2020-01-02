package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.exception.PolygonNotExist;
import pl.ioii.designpatterns.factory.model.Pentagon;
import pl.ioii.designpatterns.factory.model.Polygon;
import pl.ioii.designpatterns.factory.model.Square;
import pl.ioii.designpatterns.factory.model.Triangle;

public abstract class PolygonFactory {

    public static Polygon getExistingPolygon(int angles) {
        if (angles == 3) {
            return new Triangle();
        }

        if (angles == 4) {
            return new Square();
        }

        if (angles == 5) {
            return new Pentagon();
        }

        throw new PolygonNotExist("Polygon with provided number of angles - " + angles + " - doesn't exist in system.");
    }

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
