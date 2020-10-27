package com.unit6.interfaces;

import com.unit5.inheritance.Manager;
import sun.print.PSPrinterJob;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>,Cloneable{
    private String name;
    private double salary;
    private Date hireDay;
    private Manager manager;

    public Employee(String name, double salary,int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.hireDay = calendar.getTime();
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("P1", 10,2010,10,1);
        Manager manager = new Manager();
        manager.setSalary(1000);
        original.setManager(manager);
        Employee copy = (Employee) original.clone();
        copy.setName("P2");
        System.out.println(copy.getManager().getSalary());
        original.getManager().setSalary(10);
        System.out.println(copy.getManager().getSalary());
    }
}
