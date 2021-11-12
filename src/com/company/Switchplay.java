package com.company;

public class Switchplay {
    public static void main(String[] args) {
        char character = 'c';
        switch (character){
            case 'a':
                System.out.println("the character was a");
                break;
            case 'c': case'b': case 'd':
                System.out.println("the character was b or c or d");
                break;
            case 'e':
                System.out.println("the character was e");
                break;
            default:
                System.out.println("the character wasn't present");
                break;
        }
    }
}
