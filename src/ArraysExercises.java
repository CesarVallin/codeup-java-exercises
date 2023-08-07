import java.util.Arrays;

public class ArraysExercises {



    public static Person[] addPerson(Person[] people, Person nameToAdd) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length -1 ] = nameToAdd;
        return newArray;
    }

    public static void main(String[] args) {
        // What happens when you run the following code? why is Arrays.toString necessary
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person[] people = new Person[3];
//        Person person1 = new Person("Laura");
//        people[0] = person1;
//        Person person2 = new Person("Sofia");
//        people[1] = person2;
//        Person person3 = new Person("Raleigh");
//        people[2] = person3;

        Person[] people = {
                new Person("Laura"),
                new Person("Sofia"),
                new Person("Raleigh")
        };

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        for (Person person: people) { // (data-type, what i am calling each element, the array)
            System.out.println(person.getName());
        }

        Person newPerson = new Person("Cesar");
        people = addPerson(people, newPerson);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

    }
}
