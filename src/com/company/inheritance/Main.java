package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
        //put your code here
        Animal animal = new Animal("Animal", 1,1, 5, 5.0);
        Dog dog = new Dog("yorkie", 4, 90.3, 2, 4, 1, 56, "black fur");
        Fish fish = new Fish("fish",3, 4.3, 10, 40, 2, 2);
        fish.swim(34);
    }
}
