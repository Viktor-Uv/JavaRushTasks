package lektion0308.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Quadrants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_number1 = reader.readLine();
        String s_number2 = reader.readLine();
        int a = Integer.parseInt(s_number1);
        int b = Integer.parseInt(s_number2);

        if (a > 0) {
            if (b > 0)
                System.out.println(1);
            else if (b < 0)
                System.out.println(4);
        }
        else if (a < 0) {
            if (b > 0)
                System.out.println(2);
            else if (b < 0)
                System.out.println(3);
        }
    }
}