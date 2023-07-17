package lektion0308.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Bouncer policy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s_age = reader.readLine();
        int age = Integer.parseInt(s_age);

        if (age > 20)
            System.out.println("18 is old enough");
    }
}