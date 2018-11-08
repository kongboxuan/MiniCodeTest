package org.jason.minicodetest;

/**
 * A number is Fizz if it is divisible by 3 or if it has a 3 in it
 * A number is Buzz if it is divisible by 5 or if it has a 5 in it
 * A number is FizzBuzz if it satify above 2 criterias together
 */
public class Stage2 {
    public String say(int number) {
        // A number is FizzBuzz if it satify above 2 criterias together
        if ((number % 3 == 0 || number / 10 == 3 || number - number / 10 * 10 == 3) && (number % 5 == 0 || number / 10 == 5))
            return "FizzBuzz";
        // A number is Fizz if it is divisible by 3 or if it has a 3 in it
        else if (number % 3 == 0 || number / 10 == 3 || number - number / 10 * 10 == 3)
            return "Fizz";
        // A number is Buzz if it is divisible by 5 or if it has a 5 in it
        else if (number % 5 == 0 || number / 10 == 5)
            return "Buzz";
        else
            return String.valueOf(number);
    }

    public static void main(String[] args) {
        Stage2 stage2 = new Stage2();
        for (int i = 1; i <= 100; i++) {
            System.out.println(stage2.say(i));
        }
    }
}
