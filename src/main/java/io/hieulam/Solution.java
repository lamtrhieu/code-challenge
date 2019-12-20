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

    @Override
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

class Phone implements Singable {

    @Override
    public void sing() {
        System.out.println("Reng Reng Reng");
    }
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

interface Swimmable {
    void swim();
}

enum Size {SMALL, LARGE};

enum Color {GREY, ORANGE};


class Fish implements  Swimmable{

    protected Size size;

    protected Color color;

    public Fish() {}

    public Fish(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}

class Shark extends Fish {

    public Shark() {
        super(Size.LARGE, Color.GREY);
    }

    public void eat() {
        System.out.println("I am eating other.");
    }
}

class ClownFish extends Fish {
    public ClownFish() {
        super(Size.SMALL, Color.ORANGE);
    }

    public void makeJokes() {
        System.out.println("I am making jokes");
    }
}

class Dolphin implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Dolphim is swimmming");
    }
}

abstract class Insect {
    public abstract void fly();
    public abstract void walk();
}


class Butterfly extends Insect {

    private Insect internalState = new CatepillarState();

    public void fly() {
        internalState.fly();
    }

    public void walk() {
        internalState.walk();
    }

    public void transform() {
        System.out.println("Transform from Caterpillar to Butterfly");
        this.internalState = new ButterflyState();
    }

    public void sing() {
        throw new RuntimeException("Butterfly cannot sing");
    }

    private class CatepillarState extends Insect {

        @Override
        public void fly() {
            throw new RuntimeException("I am Catepillar. I cannot fly yet");
        }

        @Override
        public void walk() {
            System.out.println("Catepillar is walking");
        }
    }

    private class ButterflyState extends Insect {

        @Override
        public void fly() {
            System.out.println("Butterly is flying");
        }

        @Override
        public void walk() {
            throw new RuntimeException("I am Butterly. I cannot walk");
        }
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