package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Polygon;
import pl.ioii.designpatterns.factory.model.Triangle;

public class TriangleFactory implements PolygonFactory {
    @Override
    public Polygon create() {
        return new Triangle();
    }
}
