package io.hieulam;


import org.junit.jupiter.api.*;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BaseTest {


    protected static PrintStream printStream;
    protected static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setup() {
        printStream = mock(PrintStream.class);
        System.setOut(printStream);
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(originalOut);
    }

}