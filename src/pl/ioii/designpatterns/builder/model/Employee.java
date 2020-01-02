package pl.ioii.designpatterns.builder.model;

import pl.ioii.designpatterns.builder.exception.InsufficientEmployeeDataException;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private String phoneNumber;
    private String bankAccountNumber;

    private Employee() {
        // Block possibility to create an 'empty' employee object
    }

    public static class Builder {

        private Employee employee;

        public Builder(String firstName, String lastName) {
            this.employee = new Employee();
            this.employee.firstName = firstName;
            this.employee.lastName = lastName;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.employee.phoneNumber = phoneNumber;
            return this;
        }

        public Builder bankAccountNumber(String bankAccountNumber) {
            this.employee.bankAccountNumber = bankAccountNumber;
            return this;
        }

        public Builder employmentDate(LocalDate employmentDate) {
            this.employee.employmentDate = employmentDate;
            return this;
        }

        public Employee build() {
            validateEmployeeFields(employee);
            return this.employee;
        }

        private void validateEmployeeFields(Employee employee) {
            if (employee.firstName == null || employee.lastName == null) {
                throw new InsufficientEmployeeDataException("Employee should always has first and last name.");
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    public static void test() {
        System.out.println("Attempt to create an employee only with mandatory fields:");
        // Create Employee
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
