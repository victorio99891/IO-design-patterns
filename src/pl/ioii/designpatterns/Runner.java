package pl.ioii.designpatterns;

import pl.ioii.designpatterns.builder.EmployeeTest;
import pl.ioii.designpatterns.factory.PolygonFactoryTest;
import pl.ioii.designpatterns.singleton.ConfigurationSingletonTest;

public class Runner {

    public static void main(String[] args) {

        System.out.println("\n============ BUILDER TEST ============\n");
        EmployeeTest.test();

        System.out.println("\n============ FACTORY TEST ============\n");
        PolygonFactoryTest.test();

        System.out.println("\n============ SINGLETON TEST ============\n");
        ConfigurationSingletonTest.test();
    }
}
