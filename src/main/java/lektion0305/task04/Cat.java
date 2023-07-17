package lektion0305.task04;

/*
Name register
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("prettykitty", "miaos");
        System.out.println(cat.fullName);
    }
}