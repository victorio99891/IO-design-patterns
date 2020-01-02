package pl.ioii.designpatterns.builder.exception;

public class InsufficientEmployeeDataException extends RuntimeException {
    public InsufficientEmployeeDataException(String message) {
        super(message);
    }
}
