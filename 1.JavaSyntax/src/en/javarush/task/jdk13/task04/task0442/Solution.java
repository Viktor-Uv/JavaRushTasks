package en.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Adding
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
