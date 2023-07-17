package lektion0307.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Positive and negative numbers

Use the keyboard to enter a number. If the number is positive, then double it. If the number is negative, add one.
If the entered number is zero, display zero.
Display the result on the screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number = reader.readLine();
        int number = Integer.parseInt(s_number);

        if (number > 0)
            number *= 2;
        else if (number < 0)
            number += 1;

        System.out.println(number);
    }

}