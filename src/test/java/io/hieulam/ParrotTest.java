package io.hieulam;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class ParrotTest extends BaseTest {



    private Parrot parrot;

    @BeforeEach
    void beforeEach() {
//        rooster = new Rooster();
    }


    @Test
    public void testParrotWithDog() {
        parrot = new Parrot(new Dog());
        parrot.sing();
        verify(printStream).println("Woof, woof");
    }

    @Test
    public void testParrotWithCat() {
        parrot = new Parrot(new Cat());
        parrot.sing();
        verify(printStream).println("Meow");
    }

    @Test
    public void testParrotWithRooster() {
        parrot = new Parrot(new Rooster());
        parrot.sing();
        verify(printStream).println("Cock-a-doodle-doo");
    }

    @Test
    public void testParrotWithDuck() {
        parrot = new Parrot(new Duck());
        parrot.sing();
        verify(printStream).println("Quack, quack");
    }

    @Test
    public void testParrotWithPhone() {
        parrot = new Parrot(new Phone());
        parrot.sing();
        verify(printStream).println("Reng Reng Reng");
    }

}