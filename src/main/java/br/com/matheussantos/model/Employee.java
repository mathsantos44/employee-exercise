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

    public Employee(String name, Double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.calculateTaxPercentage();
    }

    public Double getNetSalary() {
        return this.grossSalary * (1 - this.tax / 100);
    }

    public void increaseSalary(Double percentage) {
        this.grossSalary = this.grossSalary * (1 + percentage / 100);
        this.calculateTaxPercentage();
    }

    public void calculateTaxPercentage() {
        if (this.grossSalary < 1518.00) {
            this.tax = 7.5;
        } else if (this.grossSalary < 2793.88) {
            this.tax = 9.0;
        } else if (this.grossSalary < 4190.83) {
            this.tax = 12.0;
        } else if (this.grossSalary < 8157.41) {
            this.tax = 14.0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                '}';
    }
}
