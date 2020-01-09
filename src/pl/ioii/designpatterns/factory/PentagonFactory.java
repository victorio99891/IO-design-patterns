package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Pentagon;
import pl.ioii.designpatterns.factory.model.Polygon;

public class PentagonFactory implements PolygonFactory {
    @Override
    public Polygon create() {
        return new Pentagon();
    }
}
