package io.hieulam;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

class ChickenTest extends BaseTest {



    private Chicken chicken;

    @BeforeEach
    void beforeEach() {
        chicken = new Chicken();
    }


    @Test
    public void testBirdWalk() {
        chicken.walk();
        verify(printStream).println("I am walking");
    }

    @Test
    public void testBirdSing() {
        chicken.sing();
        verify(printStream).println("Cluck, cluck");
    }

    @Test
    public void testBirdFly() {
        chicken.fly();
        verify(printStream).println("I am flying");
    }


}