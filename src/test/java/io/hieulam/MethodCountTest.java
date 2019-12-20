package io.hieulam;

import org.junit.jupiter.api.Test;

import static io.hieulam.Solution.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MethodCountTest {

    @Test
    public void shouldCountCanFlyCorrect() {
        boolean canFly = canFly(new Bird());
        assertThat(canFly).isTrue();

        canFly = canFly(new Dog());
        assertThat(canFly).isFalse();

        canFly = canFly(new Chicken());
        assertThat(canFly).isFalse();

    }

    @Test
    public void shouldCountCanSingCorrect() {
        boolean canSing = canSing(new Rooster());
        assertThat(canSing).isTrue();

        canSing = canSing(new Fish());
        assertThat(canSing).isFalse();

    }

    @Test
    public void shouldCountCanWalkCorrect() {
        boolean canWalk = canWalk(new Bird());
        assertThat(canWalk).isTrue();

        canWalk = canWalk(new Fish());
        assertThat(canWalk).isFalse();

        canWalk = canWalk(new Butterfly());
        assertThat(canWalk).isTrue();

        Butterfly butterfly = new Butterfly();
        butterfly.transform();
        canWalk = canWalk(butterfly);
        assertThat(canWalk).isFalse();
    }

    @Test
    public void shouldCountCanSwimCorrect() {
        boolean canSwim = canSwim(new Fish());
        assertThat(canSwim).isTrue();


        canSwim = canSwim(new Parrot(new Cat()));
        assertThat(canSwim).isFalse();
    }





}
