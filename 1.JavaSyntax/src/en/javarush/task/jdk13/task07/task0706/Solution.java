package en.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) {
                even += array[i];
            } else odd += array[i];
        }

        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }

    }
}
