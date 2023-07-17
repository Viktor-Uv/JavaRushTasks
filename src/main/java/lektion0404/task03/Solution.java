package lektion0404.task03;

/*
You can't have too much of a good thing
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        if (n > 0) {
            byte i = 0;
            while (i < n) {
                i++;
                System.out.println(string);
            }
        }
    }
}