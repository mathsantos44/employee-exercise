package br.com.matheussantos.service;

import br.com.matheussantos.model.Employee;
import br.com.matheussantos.util.InputReader;

import java.util.Scanner;

public class JobService {
    public void execute() {
        Scanner sc = new Scanner(System.in);
        InputReader reader = new InputReader(sc);

        Employee employee;

        System.out.print("Enter a Employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter a Employee Gross Salary: ");
        Double grossSalary = sc.nextDouble();

        System.out.print("Enter a Employee Tax(Press Enter to Skip): ");
        Double tax = reader.readOptionalDouble();

        if (tax == null) {
            employee = new Employee(name, grossSalary);
        } else {
            employee = new Employee(name, grossSalary, tax);
        }

        System.out.println("Employee: " + employee.toString());
        System.out.println("Employee's Net Salary: " + employee.getNetSalary());
        System.out.print("Enter a percentage increase: ");
        Double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Employee: " + employee.toString());
        System.out.println("Employee's Net Salary: " + employee.getNetSalary());

    }
}
