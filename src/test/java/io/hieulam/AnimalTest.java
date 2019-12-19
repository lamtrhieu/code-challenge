package io.hieulam;


import org.junit.jupiter.api.*;


import java.io.PrintStream;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AnimalTest {


    private static PrintStream printStream;
    private static final PrintStream originalOut = System.out;

    private Animal animal;

    @BeforeAll
    static void setup() {
        printStream = mock(PrintStream.class);
        System.setOut(printStream);
    }

    @AfterAll
    static void tearDown() {
        System.setOut(originalOut);
    }

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