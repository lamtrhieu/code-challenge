package io.hieulam;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

class FishTest extends BaseTest {



    private Fish fish;

    @Test
    public void testFishSwim() {
        fish = new Fish();
        fish.swim();
        verify(printStream).println("I am swimming");
    }

    @Test
    public void testSharkSwim() {
        Shark shark = new Shark();
        shark.swim();

        verify(printStream).println("I am swimming");
    }

    @Test
    public void testSharkEat() {
        Shark shark = new Shark();
        shark.eat();

        verify(printStream).println("I am eating other.");
    }

    @Test
    public void testClownFishSwim() {
        ClownFish clownFish = new ClownFish();
        clownFish.swim();
        verify(printStream).println("I am swimming");
    }

    @Test
    public void testClownFishMakeJokes() {
        ClownFish clownFish = new ClownFish();
        clownFish.makeJokes();
        verify(printStream).println("I am making jokes");
    }





}