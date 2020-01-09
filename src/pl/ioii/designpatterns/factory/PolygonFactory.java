package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.exception.PolygonNotFound;
import pl.ioii.designpatterns.factory.model.Pentagon;
import pl.ioii.designpatterns.factory.model.Polygon;
import pl.ioii.designpatterns.factory.model.Rectangle;
import pl.ioii.designpatterns.factory.model.Triangle;

public class PolygonFactory implements AbstractFactory<Polygon> {

    @Override
    public Polygon create(int angles) {
        if (angles == 3) {
            return new Triangle();
        }

        if (angles == 4) {
            return new Rectangle();
        }

        if (angles == 5) {
            return new Pentagon();
        }

        throw new PolygonNotFound("Polygon with provided number of angles - " + angles + " - doesn't exist in system.");
    }


}
