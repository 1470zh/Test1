package com.unit5.inheritance;

public class Manager extends Employee{
    private double bonus;

    public Manager(){

    }

    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus = 0;
    }

    public double getSalary(){
        double basesalary = super.getSalary();
        return basesalary + bonus;
    }

    public void setSalary(double bonus){
        this.bonus = bonus;
    }

}
