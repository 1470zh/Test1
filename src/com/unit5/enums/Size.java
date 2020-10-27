package com.unit5.enums;

import sun.security.util.math.SmallValue;

enum Size {
    SMALL("S"),MEDIEM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }

    private String abbreviation;
    public static void main(String[] args){
        Size size  = Enum.valueOf(Size.class, "SMALL");
        System.out.println(size.getClass());
    }
}
