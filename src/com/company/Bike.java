package com.company;

public class Bike {
    private static int speed;

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Bike.speed = speed;
    }
    public static void drive(int power){
        setSpeed(power * 10 );
        System.out.println(getSpeed());

    }
}
