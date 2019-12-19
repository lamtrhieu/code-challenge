package io.hieulam;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

class DogTest extends BaseTest {



    private Dog dog;

    @BeforeEach
    void beforeEach() {
        dog = new Dog();
    }

    @Test
    public void testDogSing() {
        dog.sing();
        verify(printStream).println("Woof, woof");
    }

}