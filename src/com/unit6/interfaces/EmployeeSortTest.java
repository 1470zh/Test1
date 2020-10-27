package com.unit6.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String...args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry",35000,1944,10,1);
        staff[1] = new Employee("Carl",65000,1944,5,3);
        staff[2] = new Employee("Tony",20000,1952,9,2);
        Arrays.sort(staff);
        for(Employee e:staff){
            System.out.println("name=" + e.getName()+",salary=" + e.getSalary());
        }

        if(staff[0] instanceof Comparable){
            System.out.println("111");
        }
    }
}
