package org.jason.minicodetest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class Stage1Test {
    @Test
    public void testSay() {
        Stage1 stage1 = new Stage1();
        // For numbers which are multiples of both three and five print "FizzBuzz".
        assertThat(stage1.say(15), equalTo("FizzBuzz"));
        assertThat(stage1.say(25), not(equalTo("FizzBuzz")));
        // For multiples of three print "Fizz"
        assertThat(stage1.say(3), equalTo("Fizz"));
        assertThat(stage1.say(4), not(equalTo("Fizz")));
        // For the multiples of five print "Buzz"
        assertThat(stage1.say(5), equalTo("Buzz"));
        assertThat(stage1.say(6), not(equalTo("Buzz")));
        // Other case
        assertThat(stage1.say(7), equalTo("7"));
        assertThat(stage1.say(15), not(equalTo("15")));
    }
}
