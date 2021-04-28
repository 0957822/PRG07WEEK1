package com.company;

public class Utils {
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void numbers(){
        for (int i = 1 ; i <= 10 ; i++ ){
            System.out.println(i);
        }
    }
    public static void parameter(int number){
        if (number > 2) {
            System.out.println("Hij is groter");
        } else {
            System.out.println("Hij is kleiner");
        }
    }
    public static void vijf(String number){
        switch (number) {
            case "een" -> System.out.println("Hij is kleiner");
            case "twee" -> System.out.println("Hij is gelijk");
            case "drie", "vier" -> System.out.println("Hij is groter");
            default -> System.out.println("NANI?!");
        }

    }
}
