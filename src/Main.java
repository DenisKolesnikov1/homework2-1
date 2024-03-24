import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    //5//6
        //5
        //"Илья Лагутенко": "Ответ в классе main":
        // при замене на новый объект мы возвращаемся в класс main:

        //6
        //"Ляпис Трубецкой": "Ответ в классе main":
        //при замене внутри метода , переменные ссылаются на одну ячейку памяти:
        Person person = new Person("Илья", "Лагутенко");
        changePerson(person);
        System.out.println(person);

    //4
        //4:
        //99,23,4: "Ответ в классе main":
        //Если при изменении в ссылочном типе данных внутри класса ,
        // то значение изменится внутри метода main:
        int[] mass = {1, 2, 3};
        changeValue(mass);
        System.out.println(Arrays.toString(mass));
    //2//3
        //2:
        //33; " Ответ в классе main":
        //изменение переменной не повлияло на ссылочный тип, т.к передаем копию ссылки:

        //3:
        //5,17,1; "Ответ в классе main":
        //т.к ссылочный тип данных внутри класса не менялся:
        Integer valueOf = 33;
        changeValue(valueOf);
        System.out.println(valueOf);
    //1
        //1:
        //33; " Ответ в класе main":
        //т.к.метод записан в области видимости класса main:
        int value = 33;
        changeValue(value);
        System.out.println(value);

    }
    //5//6
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
    //2//3
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