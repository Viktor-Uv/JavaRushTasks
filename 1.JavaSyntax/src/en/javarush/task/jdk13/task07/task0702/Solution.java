package en.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter string [" + (i + 1) + "]: ");
            array[i] = reader.readLine();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }

    }
}
