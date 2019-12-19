package io.hieulam;

class Animal {
    public void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal implements Singable {
    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}

class Duck extends Bird {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}

class Chicken extends Bird {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        throw new RuntimeException("I cannot fly. Sorry");
    }
}

class Rooster extends Chicken {
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}

class Dog extends Animal implements Singable {
    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}

class Cat extends Animal implements Singable {
    @Override
    public void sing() {
        System.out.println("Meow");
    }
}

interface Singable {
    void sing();
}

class Parrot extends Bird {
    private Singable friend;

    public Parrot(Singable friend) {
        this.friend = friend;
    }

    @Override
    public void sing() {
        friend.sing();
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