package com.unit12.pair2;

import com.unit12.pair1.Pair;
import com.unit6.interfaces.Manager;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class PairTest2 {
    public static void main(String[] args){
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1906, Calendar.DECEMBER,9),
                new GregorianCalendar(1815,Calendar.DECEMBER,10),
                new GregorianCalendar(1903,Calendar.DECEMBER,3),
                new GregorianCalendar(1910,Calendar.JUNE,22),
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst().getTime());
        System.out.println("max = " + mm.getSecond().getTime());

        Pair<String> a = new Pair<>();
        System.out.println(a instanceof Pair);

        Manager[] topHonchos = {
          new Manager("Tom",20000,1960,10,1),
          new Manager("Sam",10001,1953,5,7),
        };
        Pair<Manager> result = ArrayAlg.minmax(topHonchos);
        System.out.println(result.getFirst().getName());


    }
}
