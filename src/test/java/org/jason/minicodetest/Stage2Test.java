package org.jason.minicodetest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class Stage2Test {
    @Test
    public void testSay() {
        Stage2 stage2 = new Stage2();
        // A number is FizzBuzz if it satify above 2 criterias together
        assertThat(stage2.say(15), equalTo("FizzBuzz"));
        assertThat(stage2.say(35), equalTo("FizzBuzz"));
        assertThat(stage2.say(53), equalTo("FizzBuzz"));
        assertThat(stage2.say(25), not(equalTo("FizzBuzz")));
        // A number is Fizz if it is divisible by 3 or if it has a 3 in it
        assertThat(stage2.say(9), equalTo("Fizz"));
        assertThat(stage2.say(13), equalTo("Fizz"));
        assertThat(stage2.say(31), equalTo("Fizz"));
        assertThat(stage2.say(4), not(equalTo("Fizz")));
        // A number is Buzz if it is divisible by 5 or if it has a 5 in it
        assertThat(stage2.say(20), equalTo("Buzz"));
        assertThat(stage2.say(25), equalTo("Buzz"));
        assertThat(stage2.say(52), equalTo("Buzz"));
        assertThat(stage2.say(6), not(equalTo("Buzz")));
        // Other case
        assertThat(stage2.say(7), equalTo("7"));
        assertThat(stage2.say(15), not(equalTo("15")));
    }
}
