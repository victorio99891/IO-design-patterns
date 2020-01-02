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

}
