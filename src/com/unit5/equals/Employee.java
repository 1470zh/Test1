package com.unit5.equals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month,day);
        this.hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPerson){
        double raise = salary * byPerson / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){
        System.out.println(this.getClass().getSimpleName());
        if(this==otherObject) return true;

        if(otherObject == null) return false;

        if(getClass() != otherObject.getClass())  return false;

        Employee  other = (Employee)otherObject;

        return Objects.equals(name,other.name) && salary == other.salary &&
                Objects.equals(hireDay,other.hireDay);
    }

    public int hasCode(){
        return Objects.hash(name,salary,hireDay);
    }

    public String toString(){
        return getClass().getName() +"[name=" + name +"salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
}
