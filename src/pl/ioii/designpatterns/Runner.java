package pl.ioii.designpatterns;

import pl.ioii.designpatterns.builder.model.Employee;
import pl.ioii.designpatterns.factory.PolygonFactory;

public class Runner {

    public static void main(String[] args) {

        Employee.test();

        System.out.println("\n\n");

        PolygonFactory.test();

    }
}
