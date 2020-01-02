package pl.ioii.designpatterns.factory.exception;

public class PolygonNotExist extends RuntimeException {
    public PolygonNotExist(String message) {
        super(message);
    }
}
