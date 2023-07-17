package lektion0410.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Adding
Let's write a program where we need to enter numbers from the keyboard, and as soon as -1 is entered, then we display the sum of all the entered numbers on the screen and exit the program.
-1 should be included in the sum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int temp = 0; temp != -1; sum += temp) {
            temp = Integer.parseInt(reader.readLine());
        }

        System.out.println(sum);
    }
}
