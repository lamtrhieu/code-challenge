package io.hieulam;

class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

class Duck extends Bird {
    @Override
    void sing() {
        System.out.println("Quack, quack");
    }

    void swim() {
        System.out.println("I am swimming");
    }
}

class Chicken extends Bird {
    @Override
    void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    void fly() {
        throw new RuntimeException("I cannot fly. Sorry");
    }
}

class Rooster extends Chicken {
    @Override
    void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}