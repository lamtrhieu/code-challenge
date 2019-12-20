package io.hieulam;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class ButterflyTest extends BaseTest {
    
    private Butterfly butterfly;

    @Test
    public void testCaterpillarCanWalk() {
        butterfly = new Butterfly();
        butterfly.walk();
        verify(printStream).println("Catepillar is walking");
    }

    @Test
    public void testCatepillarCannotFly() {
        butterfly = new Butterfly();

        Exception runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
            butterfly.fly();
        });

        assertThat(runtimeException.getMessage()).isEqualTo("I am Catepillar. I cannot fly yet");
    }

    @Test
    public void testButterFlyCannotWalk() {
        butterfly = new Butterfly();
        butterfly.transform();

        verify(printStream).println("Transform from Caterpillar to Butterfly");

        Exception runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
            butterfly.walk();
        });

        assertThat(runtimeException.getMessage()).isEqualTo("I am Butterly. I cannot walk");
    }

    @Test
    public void testButterFlyCanFly() {
        butterfly = new Butterfly();
        butterfly.transform();

        verify(printStream).println("Transform from Caterpillar to Butterfly");

        butterfly.fly();
        verify(printStream).println("Butterly is flying");
    }
}