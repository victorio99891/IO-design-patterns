package pl.ioii.designpatterns.factory.model;

public final class Triangle extends Polygon {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public int getNumberOfAngles() {
        return 3;
    }
}
