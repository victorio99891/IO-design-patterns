package pl.ioii.designpatterns.factory.model;

public class Pentagon implements Polygon {

    @Override
    public String getName() {
        return "pentagon";
    }

    @Override
    public int getNumberOfAngles() {
        return 5;
    }
}
