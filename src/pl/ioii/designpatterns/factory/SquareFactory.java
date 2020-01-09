package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Polygon;
import pl.ioii.designpatterns.factory.model.Square;

public class SquareFactory implements PolygonFactory {
    @Override
    public Polygon create() {
        return new Square();
    }
}
