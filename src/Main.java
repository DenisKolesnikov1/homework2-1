import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Илья", "Лагутенко");
        changePerson(person);
        System.out.println(person);
    //4
        int[] mass = {1, 2, 3};
        changeValue(mass);
        System.out.println(Arrays.toString(mass));
    //2//3
        Integer valueOf = 33;
        changeValue(valueOf);
        System.out.println(valueOf);
    //1
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    private static void changePerson(Person person) {
        System.out.println(person);
        person = new Person("Ляпис", "Трубецкой");
        System.out.println(person);
        person.name = "Ляпис";
        person.surname = "Трубецкой";
        System.out.println(person);
    }
    //4
    private static void changeValue(int[] value) {
        System.out.println(Arrays.toString(value));
        value = new int[]{3, 3, 3};
        System.out.println(Arrays.toString(value));
        value[0] = 99;
        System.out.println(Arrays.toString(value));
    }
    //2
    private static void changeValue(Integer valueOf) {
        System.out.println(valueOf);
        valueOf = 22;
        System.out.println(valueOf);
    }
    //1
    private static void changeValue(int value) {
        System.out.println(value);
        value = 22;
        System.out.println(value);
    }
}