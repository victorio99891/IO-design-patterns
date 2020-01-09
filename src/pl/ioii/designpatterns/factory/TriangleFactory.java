package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Triangle;

public class TriangleFactory implements AbstractFactory<Triangle> {
    @Override
    public Triangle create() {
        return new Triangle();
    }
}
