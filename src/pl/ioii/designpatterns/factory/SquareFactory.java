package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Square;

public class SquareFactory implements AbstractFactory<Square> {
    @Override
    public Square create() {
        return new Square();
    }
}
