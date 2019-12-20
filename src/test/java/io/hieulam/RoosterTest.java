package io.hieulam;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class RoosterTest extends BaseTest {



    private Rooster rooster;

    @BeforeEach
    void beforeEach() {
        rooster = new Rooster();
    }


    @Test
    public void testBirdWalk() {
        rooster.walk();
        verify(printStream).println("I am walking");
    }

    @Test
    public void testBirdSing() {
        rooster.sing();
        verify(printStream).println("Cock-a-doodle-doo");
    }

    @Test
    public void testBirdFly() {
        Exception runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
            rooster.fly();
        });

        assertThat(runtimeException.getMessage()).isEqualTo("I cannot fly. Sorry");
    }

    @Test
    public void testRoosterCanSoundDifferent() {
        rooster = new Rooster(new VietnameseTone());
        rooster.sing();
        verify(printStream).println("o-o-o-o");
    }


}