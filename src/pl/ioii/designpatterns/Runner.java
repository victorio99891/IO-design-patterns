package pl.ioii.designpatterns;

import pl.ioii.designpatterns.builder.EmployeeTest;
import pl.ioii.designpatterns.factory.PolygonFactoryTest;

public class Runner {

    public static void main(String[] args) {

        System.out.println("\n============ BUILDER TEST ============\n");
        EmployeeTest.test();

        System.out.println("\n============ FACTORY TEST ============\n");
        PolygonFactoryTest.test();

    }
}
