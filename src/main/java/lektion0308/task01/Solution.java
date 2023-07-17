package lektion0308.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Minimum of two numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number1 = reader.readLine();
        String s_number2 = reader.readLine();
        int number1 = Integer.parseInt(s_number1);
        int number2 = Integer.parseInt(s_number2);

        if (number1 < number2)
            System.out.println(number1);
        else if (number1 > number2)
            System.out.println(number2);
        else
            System.out.println(number1);
    }
}