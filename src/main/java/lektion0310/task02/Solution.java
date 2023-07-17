package lektion0310.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Describing numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number = reader.readLine();
        int number = Integer.parseInt(s_number);

        boolean isEven = number % 2 == 0;

        if (number >= 1 && number <= 9) {
            if (isEven)
                System.out.println("even single-digit number");
            else
                System.out.println("odd single-digit number");
        } else if (number >= 10 && number <= 99) {
            if (isEven)
                System.out.println("even two-digit number");
            else
                System.out.println("odd two-digit number");
        } else if (number >= 100 && number <= 999) {
            if (isEven)
                System.out.println("even three-digit number");
            else
                System.out.println("odd three-digit number");
        }
    }
}