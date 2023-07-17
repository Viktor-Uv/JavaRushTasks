package lektion0310.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Labels and numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number = reader.readLine();
        int number = Integer.parseInt(s_number);

        boolean isEven = number % 2 == 0;
        boolean isPositive = number > 0;
        boolean isZero = number == 0;

        if (isZero)
            System.out.println("Zero");
        else if (isPositive) {
            if (isEven)
                System.out.println("Positive even number");
            else
                System.out.println("Positive odd number");
        }
        else {
            if (isEven)
                System.out.println("Negative even number");
            else
                System.out.println("Negative odd number");
        }
    }
}