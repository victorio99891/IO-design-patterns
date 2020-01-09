package pl.ioii.designpatterns.factory.exception;

public class PolygonNotFound extends RuntimeException {
    public PolygonNotFound(String message) {
        super(message);
    }
}
