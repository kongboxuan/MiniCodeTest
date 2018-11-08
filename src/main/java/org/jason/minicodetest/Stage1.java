package org.jason.minicodetest;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the
 * number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five
 * print "FizzBuzz".
 */
public class Stage1 {

    public String say(int number) {
        // For numbers which are multiples of both three and five print "FizzBuzz".
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        // For multiples of three print "Fizz"
        else if (number % 3 == 0)
            return "Fizz";
        // For the multiples of five print "Buzz"
        else if (number % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }

    public static void main(String[] args) {
        Stage1 stage1 = new Stage1();
        for (int i = 1; i <= 100; i++) {
            System.out.println(stage1.say(i));
        }
    }
}
