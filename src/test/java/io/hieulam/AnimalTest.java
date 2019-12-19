package io.hieulam;


import org.junit.jupiter.api.*;


import java.io.PrintStream;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AnimalTest extends BaseTest {

    private Animal animal;


    @BeforeEach
    void beforeEach() {
        animal = new Animal();
    }


    @AfterEach
    void afterEach() {

    }

    @Test
    public void testAnimalWalk() {
        animal.walk();
        verify(printStream).println("I am walking");
    }


}