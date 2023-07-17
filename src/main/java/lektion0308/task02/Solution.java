package lektion0308.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s_age = reader.readLine();
        int age = Integer.parseInt(s_age);

        if (age < 18)
            System.out.println("Grow up a little more");
    }
}