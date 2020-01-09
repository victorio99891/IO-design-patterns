package pl.ioii.designpatterns.factory.model;

public interface Polygon {

    String getName();

    int getNumberOfAngles();

    default void printDetails() {
        System.out.println("This polygon has name " + this.getName() + " and " + this.getNumberOfAngles() + " angles.");
    }
}
