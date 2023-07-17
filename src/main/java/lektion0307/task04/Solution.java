package lektion0307.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Day of the week
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number = reader.readLine();
        int number = Integer.parseInt(s_number);

        if (number == 1)
            System.out.println("Monday");
        else if (number == 2)
            System.out.println("Tuesday");
        else if (number == 3)
            System.out.println("Wednesday");
        else if (number == 4)
            System.out.println("Thursday");
        else if (number == 5)
            System.out.println("Friday");
        else if (number == 6)
            System.out.println("Saturday");
        else if (number == 7)
            System.out.println("Sunday");
        else
            System.out.println("No such day of the week");
    }
}