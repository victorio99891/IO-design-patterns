package pl.ioii.designpatterns.factory.model;

public interface Polygon {

    String getName();

    int getNumberOfAngles();

    default void printDetails() {
        System.out.println("Created polygon with name: " + this.getName() + " and " + this.getNumberOfAngles() + " angles.");
    }
}
