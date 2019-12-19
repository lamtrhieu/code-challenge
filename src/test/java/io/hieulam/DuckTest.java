package io.hieulam;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

class DuckTest extends BaseTest {



    private Duck duck;

    @BeforeEach
    void beforeEach() {
        duck = new Duck();
    }


    @Test
    public void testBirdWalk() {
        duck.walk();
        verify(printStream).println("I am walking");
    }

    @Test
    public void testBirdSing() {
        duck.sing();
        verify(printStream).println("Quack, quack");
    }

    @Test
    public void testBirdFly() {
        duck.fly();
        verify(printStream).println("I am flying");
    }

    @Test
    public void testDuckSwim() {
        duck.swim();
        verify(printStream).println("I am swimming");
    }


}