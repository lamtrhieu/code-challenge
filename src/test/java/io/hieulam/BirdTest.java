package io.hieulam;


import org.junit.jupiter.api.*;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BirdTest extends BaseTest {



    private Bird bird;

    @BeforeEach
    void beforeEach() {
        bird = new Bird();
    }


    @Test
    public void testBirdWalk() {
        bird.walk();
        verify(printStream).println("I am walking");
    }

    @Test
    public void testBirdSing() {
        bird.sing();
        verify(printStream).println("I am singing");
    }

    @Test
    public void testBirdFly() {
        bird.fly();
        verify(printStream).println("I am flying");
    }


}