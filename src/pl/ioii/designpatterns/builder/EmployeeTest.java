package pl.ioii.designpatterns.builder;

import pl.ioii.designpatterns.builder.model.Employee;

import java.time.LocalDate;

public class EmployeeTest {

    public static void test() {
        System.out.println("Attempt to create an employee only with mandatory fields:");

        Employee employee = new Employee.Builder("Adam", "Kowalski")
                .build();

        System.out.println(employee);

        System.out.println("Attempt to create an employee with  all fields:");

        employee = new Employee.Builder("Anna", "Nowak")
                .phoneNumber("123-456-789")
                .bankAccountNumber("0987654321")
                .employmentDate(LocalDate.now())
                .build();

        System.out.println(employee);

        System.out.println("Attempt to create an employee with mandatory fields set to 'null' values.");
        try {
            Employee badEmployee = new Employee.Builder(null, null)
                    .phoneNumber("123-456-789")
                    .bankAccountNumber("0987654321")
                    .build();
            System.out.println(badEmployee);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}
