package com.company;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter figure");
        int figure = scanner.nextInt();
        int min = figure;
        int max = figure;
        while(figure != 0){
            System.out.println("Enter figure");
            figure = scanner.nextInt();
            if(figure >= max)
                max = figure;
            else if(figure <= min && figure != 0)
            min = figure;
        }
        System.out.println("The max is " + max + " and the min is " + min);
    }
}
