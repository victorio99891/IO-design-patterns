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
}
