package com.company;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(11);
    }
    public static void printDayOfWeek(int day){
        switch (day){
            case 0:
                System.out.println("The day is a sunday");
                break;
            case 1:
                System.out.println("The day is a monday");
                break;
            case 2:
                System.out.println("The day is a tuesday");
                break;
            case 3:
                System.out.println("The day is a wednesday");
                break;
            case 4:
                System.out.println("The day is a thursday");
                break;
            case 5:
                System.out.println("The day is a friday");
                break;
            case 6:
                System.out.println("The day is a saturday");
                break;
            default:
                System.out.println("this day doesnt exist in the week");
                break;
        }
    }
}
