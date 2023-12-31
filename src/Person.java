public class Person {

    // ---------------------------------------------------------------------------------------------------------
    // Instance property... (fields)
    private String name;
    // ---------------------------------------------------------------------------------------------------------
    // Constructors...
    public Person(String name){
        this.name = name;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters and Setters...
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Instance methods...
    public void sayHello(){
        System.out.println("Hello from " + this.name);
    }
    // ---------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // `personA` is an instance of the Person Class
        Person personA = new Person("Cesar");
        System.out.println(personA.getName());
        personA.sayHello();
        personA.setName("Bob");
        System.out.println(personA.getName());
        personA.sayHello();

        // Object (instances of the Person Class) are stored somewhere in memory, the variable names only point to that specific spot in memory.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        // names are equal, not objects

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // objects are equal

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        // You set both objects to be equal, so now any method affects them both!!


    }


}
