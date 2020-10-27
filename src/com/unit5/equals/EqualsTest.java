package com.unit5.equals;

import java.util.ArrayList;
import java.util.List;

public  class EqualsTest<T> {


    public synchronized void test(T a){
        System.out.print(a);
    }

    public static void main(String[] args){
        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);
        Employee bob = new Employee("Bob Branson",50000,1989,10,1);
        Employee employee = new Manager("ADFSF",50000,1989,10,1);
        employee.equals(bob);
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        EqualsTest test =  new EqualsTest<String>();
        EqualsTest<Manager> tst =  new EqualsTest<Manager>();
        tst.test((Manager) employee);
        System.out.println();
    }
}
