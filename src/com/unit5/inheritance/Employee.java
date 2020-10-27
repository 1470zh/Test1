package com.unit5.inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    private Manager manager;

    public Employee(){

    }

    public Employee(String name,double salary,int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPersent){
        double raise = salary * byPersent /100;
        salary = salary +raise;
    }

}
