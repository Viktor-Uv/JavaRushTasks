package beforeLektion0305;/*
New Java Syntax
3 уровень, 4 лекция
This age doesn't work for me…
*/

public class Task0304_adjustAge {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            age = age + 20;
            System.out.println("The age in adjustAge() is: " + age);
            this.age = age; // Added to update instance variable
        }
    }
}