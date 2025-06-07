package br.com.matheussantos.model;

public class Employee {
    private final String name;
    private Double grossSalary;
    private Double tax;

    public Employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Double getNetSalary() {
        return null;
    }

    public void increaseSalary(Double percentage) {
    }
}
