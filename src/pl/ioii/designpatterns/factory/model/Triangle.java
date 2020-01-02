package pl.ioii.designpatterns.factory.model;

public final class Triangle implements Polygon {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public int getNumberOfAngles() {
        return 3;
    }
}
