package pl.ioii.designpatterns.factory.model;

public class Pentagon extends Polygon {

    @Override
    public String getName() {
        return "pentagon";
    }

    @Override
    public int getNumberOfAngles() {
        return 5;
    }
}
