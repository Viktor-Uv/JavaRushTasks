package lektion0410.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Somewhere in the middle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Take 3 numbers
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        // Find min and max
        int max = Integer.max(Integer.max(a, b), c);
        int min = Integer.min(Integer.min(a, b), c);

        // Find middle number
        if (a != min && a != max) {
            System.out.println(a);
        } else if (b != min && b != max) {
            System.out.println(b);
        } else if (c != min && c != max) {
            System.out.println(c);
        // Handle case with similar numbers
        } else if (a == b) {
            System.out.println(a);
        } else System.out.println(c);
    }
}
