package com.company;

public class WhileAndDowhile {
    public static void main(String[] args) {

        int start = 4;
        int finish = 20;
        int evenNumbers = 0;
        int numbers = 0;
        while (start != 20) {
            start++;
            if(isEvenNumber(start)) {
                evenNumbers++;
                numbers += start;
                System.out.println(start + " is an even number");
            }
            else
                System.out.println(start + " is not an even number");

        }
        System.out.println("total number of even numbers is " + evenNumbers +
                " and the addition of even numbers is " + numbers);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
