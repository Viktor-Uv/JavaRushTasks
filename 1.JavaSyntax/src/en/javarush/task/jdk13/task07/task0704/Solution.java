package en.javarush.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Array of numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            //System.out.print("Enter number [" + (i + 1) + "]: ");
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }

    }
}
