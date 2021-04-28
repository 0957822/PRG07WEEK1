package com.company;

public class Tandem {
    private static int people;

    public static int getPeople() {
        return people;
    }

    public static void setPeople(int sit) {
        Bike.sit = people;
    }
    public static void sit(int power){
        System.out.println(getPeople());

    }
}
