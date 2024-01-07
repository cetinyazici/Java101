/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maashesaplayici;

import java.time.Year;

/**
 *
 * @author Lenovo
 */
public class Employee {
    String name;
    private double salary;
    private final int workHours;
    private final int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.workHours = workHours;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            this.salary = this.salary + (this.salary * 5 / 100);
        } else if (yearsWorked >= 10 && yearsWorked <= 20) {
            this.salary = this.salary + (this.salary * 10 / 100);
        } else {
            this.salary = this.salary + (this.salary * 15 / 100);
        }
    }

    @Override
    public String toString() {
        double totalSalary = salary + bonus() - tax();
        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + (salary * 0.05) +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary +
                "\nToplam Maaş: " + totalSalary;
    }
}
