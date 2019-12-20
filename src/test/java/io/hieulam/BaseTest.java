package io.hieulam;


import org.junit.jupiter.api.*;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BaseTest {


    protected PrintStream printStream;
    protected final PrintStream originalOut = System.out;

    @BeforeEach
    public void setup() {
        printStream = mock(PrintStream.class);
        System.setOut(printStream);
    }

    @AfterEach
    public void afterEach() {
        System.setOut(originalOut);
    }

}