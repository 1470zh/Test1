package com.unit6.interfaces;

import java.util.Date;

public class Manager extends Employee{
    public Manager(String name, double salary, int year,int month,int day) {
        super(name, salary, year,month,day);
    }

    @Override
    public int compareTo(Employee o) {
        return super.compareTo(o);
    }
}
