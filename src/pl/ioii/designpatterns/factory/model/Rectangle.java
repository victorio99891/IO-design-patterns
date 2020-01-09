package pl.ioii.designpatterns.factory.model;

public class Rectangle implements Polygon {

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public int getNumberOfAngles() {
        return 4;
    }
}
