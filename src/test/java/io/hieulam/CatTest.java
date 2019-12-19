package io.hieulam;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

class CatTest extends BaseTest {



    private Cat cat;

    @BeforeEach
    void beforeEach() {
        cat = new Cat();
    }

    @Test
    public void testBirdSing() {
        cat.sing();
        verify(printStream).println("Meow");
    }
}