package beforeLektion0305;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
New Java Syntax, 2 уровень, 8 лекция
Predictions
*/

public class Task0208_inputreader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s_amount = reader.readLine();
        String s_age = reader.readLine();
        int amount = Integer.parseInt(s_amount);
        int age = Integer.parseInt(s_age);

        System.out.println(name + " will receive " + amount + " in " + age + " years.");
    }
}

   // public static void main(String[] args) throws Exception {