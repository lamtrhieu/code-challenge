package io.hieulam;

import java.util.Arrays;

class Animal {

}

class Bird extends Animal implements Singable, Flyable, Walkable {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
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

interface Tone {
    String getTone();
}

class VietnameseTone implements Tone {

    @Override
    public String getTone() {
        return "o-o-o-o";
    }
}

class EnglishTone implements Tone {

    @Override
    public String getTone() {
        return "Cock-a-doodle-doo";
    }
}

class Rooster extends Chicken {

    private Tone tone;

    public Rooster() {
        this.tone = new EnglishTone();
    }

    public Rooster(Tone tone) {
        this.tone = tone;
    }

    @Override
    public void sing() {
        System.out.println(tone.getTone());
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

interface Swimmable {
    void swim();
}

interface Walkable {
    void walk();
}

interface Flyable {
    void fly();
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



enum Size {SMALL, LARGE};

enum Color {GREY, ORANGE};


class Fish extends Animal implements  Swimmable{

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

class Dolphin extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Dolphim is swimmming");
    }
}

abstract class Insect extends Animal implements Flyable, Walkable{
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

class Frog extends Animal implements Singable, Swimmable {

    @Override
    public void sing() {
        System.out.println("Op Op Op");
    }

    @Override
    public void swim() {
        System.out.println("Frog is swimming");
    }

}

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Cat()),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        //Count animal can fly
        long canFly = Arrays.stream(animals).filter(o -> canFly(o)).count();
        //Count animal can walk
        long canWalk = Arrays.stream(animals).filter(o -> canWalk(o)).count();
        //Count animal can sing
        long canSing = Arrays.stream(animals).filter(o -> canSing(o)).count();
        //Count animal can swim
        long canSwim = Arrays.stream(animals).filter(o -> canSwim(o)).count();

        System.out.println(canFly + " " + canWalk + " " + canSing + " " + canSwim);
    }

    private static boolean canSwim(Animal animal) {
        boolean result = false;
        if (animal instanceof Swimmable) {
            try {
                ((Swimmable) animal).swim();
                result = true;
            } catch (RuntimeException exception) {
                result = false;
            }
        }

        return result;
    }

    private static boolean canSing(Animal animal) {
        boolean result = false;
        if (animal instanceof Singable) {
            try {
                ((Singable) animal).sing();
                result = true;
            } catch (RuntimeException exception) {
                result = false;
            }
        }

        return result;
    }

    private static boolean canWalk(Animal animal) {
        boolean result = false;
        if (animal instanceof Walkable) {
            try {
                ((Walkable) animal).walk();
                result = true;
            } catch (RuntimeException exception) {
                result = false;
            }
        }

        return result;
    }

    public static boolean canFly(Animal animal) {
        boolean result = false;
        if (animal instanceof Flyable) {
            try {
                ((Flyable) animal).fly();
                result = true;
            } catch (RuntimeException exception) {
                result = false;
            }
        }

        return result;
    }


}