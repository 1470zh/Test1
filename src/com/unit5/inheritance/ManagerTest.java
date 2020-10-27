package com.unit5.inheritance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManagerTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Manager boss = new Manager("Carl Craker",8000,1987,12,15);
        boss.setSalary(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",5000,1989,10,1);
        staff[2] = new Employee("Tommy Tester",4000,1990,3,15);
//
//        for(Employee e:staff)
//            System.out.println("name"+e.getName()+",salary="+e.getSalary());
        Employee e = new Employee("John",60000,1996,11,17);
        Employee m = new Manager("Tom",60000,1996,11,17);
//        System.out.println(e.getClass().getSimpleName()+ " "+ e.getName());
//        System.out.println(m.getClass().getSimpleName()+ " "+ m.getName());
        String className = m.getClass().getName();
        System.out.println(className);
        try {
            Class c = Class.forName(className);
            System.out.println(c);
            Constructor<?>[] constructors =c.getConstructors();
            Employee obj = (Employee)constructors[1].newInstance("Bob",40000,1996,11,11);
            System.out.println(obj.getName());
        } catch (ClassNotFoundException | InvocationTargetException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        System.out.println(e.getClass().newInstance().getName());

    }
}
