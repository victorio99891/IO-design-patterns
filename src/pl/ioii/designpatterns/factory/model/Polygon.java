package pl.ioii.designpatterns.factory.model;

public abstract class Polygon {

    public abstract String getName();

    public abstract int getNumberOfAngles();

    public void printDetails() {
        System.out.println("Created polygon with name: " + this.getName() + " and " + this.getNumberOfAngles() + " angles.");
    }
}
